package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.LabelTypeEnum;
import model.ProductModel;
import service.DiscountService;

@RestController
@RequestMapping(value = "/discount")
public class DiscountController {
	

	@Autowired
	private DiscountService discountService;
	
	 @GetMapping(value = "/discountedProductsByCategoryId/{categoryId}")
		public List<ProductModel> getDiscountedProductsByCAtegoryId(@PathVariable(required = true) Integer categoryId, @RequestParam(required = false) LabelTypeEnum priceLabelType){
			
			Optional<LabelTypeEnum> labelType = Optional.ofNullable(priceLabelType);
			
			return discountService.getDiscountedProducts(categoryId, labelType);
		}
	

}
