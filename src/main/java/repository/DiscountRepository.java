package repository;

import java.util.List;

import domain.Product;

public interface DiscountRepository {
	List<Product> getDiscountedProducts(Integer categoryId);

}
