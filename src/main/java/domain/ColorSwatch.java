package domain;

public class ColorSwatch {

	public ColorSwatch() {
		
	}
	
	
	
	private String basicColor;
	private String skuId;
	private String color;
	
	
	
	public ColorSwatch(String basicColor, String skuId, String color) {
		super();
		this.basicColor = basicColor;
		this.skuId = skuId;
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColorSwatch [basicColor=" + basicColor + ", skuId=" + skuId + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((basicColor == null) ? 0 : basicColor.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((skuId == null) ? 0 : skuId.hashCode());
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
		ColorSwatch other = (ColorSwatch) obj;
		if (basicColor == null) {
			if (other.basicColor != null)
				return false;
		} else if (!basicColor.equals(other.basicColor))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (skuId == null) {
			if (other.skuId != null)
				return false;
		} else if (!skuId.equals(other.skuId))
			return false;
		return true;
	}

	public String getBasicColor() {
		return basicColor;
	}

	public void setBasicColor(String basicColor) {
		this.basicColor = basicColor;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
