package repository;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import domain.Category;
import domain.Product;
@Repository
public class DiscountRepositoryImpl implements DiscountRepository {

	

	@Override
	public List<Product> getDiscountedProducts(Integer categoryId) {
RestTemplate restTemplate = new RestTemplate();
		
		String resourceUrl = "https://jl-nonprod-syst.apigee.net/v1/categories/"+categoryId+"/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma";
							  //https://jl-nonprod-syst.apigee.net/v1/categories/600001506/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma
		ResponseEntity<Category> response
		  = restTemplate.exchange(
				    resourceUrl ,
					HttpMethod.GET,
					null,
					new ParameterizedTypeReference<Category>() {});
		
		if(response.getStatusCode().is2xxSuccessful())
			System.out.println("Gotcha from api {}"+response.getBody().getProducts());
		
		
		return response.getBody().getProducts();
	}

}
