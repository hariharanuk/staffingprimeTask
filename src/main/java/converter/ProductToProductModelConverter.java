package converter;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import domain.ColorSwatch;
import domain.Price;
import domain.Product;
import model.ColorSwatchModel;
import model.LabelTypeEnum;
import model.ProductModel;

public class ProductToProductModelConverter {

	public ProductModel convert(Product source, Optional<LabelTypeEnum> labelType) {
		
		if(source==null)
			return null;

		String priceLabel = printPriceLabel(labelType, source.getPrice());
		
		System.out.println("product id {} "+source.getProductId());
		
		List<ColorSwatch> ls = new ArrayList<>();
		ColorSwatchModel csw  = new ColorSwatchModel();
		ProductModel target = new ProductModel();
		
		List<ColorSwatchModel> lsm = new ArrayList<>();
		
		target.setProductId(source.getProductId());
		target.setTitle(source.getTitle());
		target.setPriceLabel(priceLabel);
		target.setNowPrice(nowPrice(source.getPrice()));	
		if(source.getColorSwatches()!= null) {
			ls = source.getColorSwatches();
			 lsm = new ArrayList<>();
			for(ColorSwatch str : source.getColorSwatches()) {
				csw = new ColorSwatchModel();
				csw.setSkuId(str.getSkuId());
				csw.setRgbColor(rgbColorToHex(str.getBasicColor()));
				csw.setColor(str.getColor());
				lsm.add(csw);
			}
			target.setColorSwatches(lsm);
		}
		
		System.out.println(" {}"+target);
		
		
		return target;
		
	}
	
	private String rgbColorToHex(String key) {
		Hashtable<String,String> ht = new Hashtable<>();
		ht.put("Red","FF0000");
		ht.put("Blue","0000FF");
		ht.put("Pink","FF00FF");
		ht.put("Black","000000");
		ht.put("Green","008000");
		ht.put("Grey","808080");
		ht.put("Multi","RRGGBB");
		ht.put("Orange","FF8000");
		ht.put("Purple","800080");
		ht.put("White","FFFFF");
		return ht.containsKey(key) ?  ht.get(key) :  null;
		
		
	}
	
	/**
	 * which is the price.now represented as a string, including the currency, e.g. “£1.75”. For values that are integer, if they are less £10 return a decimal price, otherwise show an integer price, e.g. “£2.00” or  “£10”. 
	 * @param price Price.class
	 * @return String
	 */
	private String nowPrice(Price price) {
		Float nowPrice;
		
		try {
			nowPrice = Float.parseFloat((String)price.getNow());
		}catch (Exception e) {
			
			nowPrice = 1.23f;
		}	
		return nowPrice <10 ? price.getCurrency().getResponse()+Math.round(nowPrice) : price.getCurrency().getResponse()+ nowPrice ;
	}
	
	
	/**
	 * price label processes
	 * @param labelType Optional<LabelTypeEnum>
	 * @param price Price
	 * @return String
	 */
	//TODO: I don't have a time
	private String printPriceLabel(Optional<LabelTypeEnum> labelType, Price price) {
		
		String response="";
		
		//LabelTypeEnum priceLabel = labelType.map(x -> {	return x;}).orElse(LabelTypeEnum.ShowWasThenNow);
		
		LabelTypeEnum priceLabel = labelType.map(x -> {	return x;}).orElse(LabelTypeEnum.ShowWasNow);
		
		if(LabelTypeEnum.ShowWasNow.equals(priceLabel)) {
			
			response = price.getWas().map( x -> {return "Was " +price.getCurrency().getResponse()+x+", now "+nowPrice(price);})
			.orElse("Was "+nowPrice(price)+", now "+nowPrice(price));
		
		}
		else if(LabelTypeEnum.ShowWasThenNow.equals(priceLabel)) {
			String was = null;
			String then = null;
			String now = null;
			
			
			
			if(price.getThen1().toString()!="") {
				was = price.getWas().map( x -> {return "Was " +price.getCurrency().getResponse()+x;}).orElse("");
				then = price.getThen1().map(y->{return ",then "+price.getCurrency().getResponse()+y;}).orElse("");
				now = ", now "+(then).replace(",then ", "");
				response = (was+then+now);
			}
			else {
				response = "Was "+nowPrice(price)+", now "+nowPrice(price);
			}
			
		}
			
			
		else if(LabelTypeEnum.ShowPercDscount.equals(priceLabel)) {
			//response = calculateDiscountPersentange(price.getWas(),price.getNow());
		}
			

		
		return response;
	}
	

	
	
	/**
	 * Calculate discount persantange
	 * @param nowPrice Float
	 * @param beforePrice Float
	 * @return discountPersantage Float
	 */
	private Float calculateDiscountPersentange(Float nowPrice, Float beforePrice) {
		return ((nowPrice-beforePrice)/beforePrice)*100;
	}
}
