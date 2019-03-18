package service;

import java.util.List;
import java.util.Optional;

import model.LabelTypeEnum;
import model.ProductModel;

public interface DiscountService {
	List<ProductModel> getDiscountedProducts(Integer categoryId, Optional<LabelTypeEnum> priceLabelType);
}
