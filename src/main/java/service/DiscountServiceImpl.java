package service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import converter.ProductToProductModelConverter;
import model.LabelTypeEnum;
import model.ProductModel;
import repository.DiscountRepository;
@Service
public class DiscountServiceImpl implements DiscountService {



	@Autowired
	private DiscountRepository discountRepository;

	@Override
	public List<ProductModel> getDiscountedProducts(Integer categoryId, Optional<LabelTypeEnum> priceLabelType) {
		// converter
		ProductToProductModelConverter productConverter = new ProductToProductModelConverter();
		
		// convert product to productModel and map elements to productModel list
		List<ProductModel> productModels = discountRepository.getDiscountedProducts(categoryId).stream().map(product ->
								{ return productConverter.convert(product, priceLabelType);}
						).collect(Collectors.toList());
		
		return productModels;
	}

}
