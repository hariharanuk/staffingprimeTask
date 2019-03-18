package model;

import java.util.ArrayList;
import java.util.List;

public class ProductModel {

	public ProductModel() {
		// TODO Auto-generated constructor stub
	}
	
	private String productId;
	

	private String title;
	private String nowPrice;
	private String priceLabel;
	private Float discount;
	private List<ColorSwatchModel> colorSwatches = new ArrayList<>();
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNowPrice() {
		return nowPrice;
	}
	public void setNowPrice(String nowPrice) {
		this.nowPrice = nowPrice;
	}
	public String getPriceLabel() {
		return priceLabel;
	}
	public void setPriceLabel(String priceLabel) {
		this.priceLabel = priceLabel;
	}
	public Float getDiscount() {
		return discount;
	}
	public void setDiscount(Float discount) {
		this.discount = discount;
	}
	public List<ColorSwatchModel> getColorSwatches() {
		return colorSwatches;
	}
	public void setColorSwatches(List<ColorSwatchModel> colorSwatches) {
		this.colorSwatches = colorSwatches;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colorSwatches == null) ? 0 : colorSwatches.hashCode());
		result = prime * result + ((discount == null) ? 0 : discount.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((nowPrice == null) ? 0 : nowPrice.hashCode());
		result = prime * result + ((priceLabel == null) ? 0 : priceLabel.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductModel other = (ProductModel) obj;
		if (colorSwatches == null) {
			if (other.colorSwatches != null)
				return false;
		} else if (!colorSwatches.equals(other.colorSwatches))
			return false;
		if (discount == null) {
			if (other.discount != null)
				return false;
		} else if (!discount.equals(other.discount))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (nowPrice == null) {
			if (other.nowPrice != null)
				return false;
		} else if (!nowPrice.equals(other.nowPrice))
			return false;
		if (priceLabel == null) {
			if (other.priceLabel != null)
				return false;
		} else if (!priceLabel.equals(other.priceLabel))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ProductModel [id=" + productId + ", title=" + title + ", nowPrice=" + nowPrice + ", priceLabel=" + priceLabel
				+ ", discount=" + discount + ", colorSwatches=" + colorSwatches + "]";
	}
	public ProductModel(String productId, String title, String nowPrice, String priceLabel, Float discount,
			List<ColorSwatchModel> colorSwatches) {
		super();
		this.productId = productId;
		this.title = title;
		this.nowPrice = nowPrice;
		this.priceLabel = priceLabel;
		this.discount = discount;
		this.colorSwatches = colorSwatches;
	}

	
}
