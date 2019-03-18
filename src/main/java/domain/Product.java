package domain;

import java.util.ArrayList;
import java.util.List;

public class Product {

	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	private String productId;
	private String title;
	private Price price;
	private List<ColorSwatch> colorSwatches = new ArrayList<>();
	
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
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public List<ColorSwatch> getColorSwatches() {
		return colorSwatches;
	}
	public void setColorSwatches(List<ColorSwatch> colorSwatches) {
		this.colorSwatches = colorSwatches;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colorSwatches == null) ? 0 : colorSwatches.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
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
		Product other = (Product) obj;
		if (colorSwatches == null) {
			if (other.colorSwatches != null)
				return false;
		} else if (!colorSwatches.equals(other.colorSwatches))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
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
		return "Product [productId=" + productId + ", title=" + title + ", price=" + price + ", colorSwatches="
				+ colorSwatches + "]";
	}
	public Product(String productId, String title, Price price, List<ColorSwatch> colorSwatches) {
		super();
		this.productId = productId;
		this.title = title;
		this.price = price;
		this.colorSwatches = colorSwatches;
	}
	public Product(String productId, String title, Price price) {
		super();
		this.productId = productId;
		this.title = title;
		this.price = price;
	}

	
}
