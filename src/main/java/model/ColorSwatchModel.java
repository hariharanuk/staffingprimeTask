package model;

public class ColorSwatchModel {

	public ColorSwatchModel() {
		// TODO Auto-generated constructor stub
	}
	
	private String rgbColor;
	private String skuId;
	private String color;
	
	public String getRgbColor() {
		return rgbColor;
	}
	public void setRgbColor(String rgbColor) {
		this.rgbColor = rgbColor;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((rgbColor == null) ? 0 : rgbColor.hashCode());
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
		ColorSwatchModel other = (ColorSwatchModel) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (rgbColor == null) {
			if (other.rgbColor != null)
				return false;
		} else if (!rgbColor.equals(other.rgbColor))
			return false;
		if (skuId == null) {
			if (other.skuId != null)
				return false;
		} else if (!skuId.equals(other.skuId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ColorSwatchModel [rgbColor=" + rgbColor + ", skuId=" + skuId + ", color=" + color + "]";
	}
	public ColorSwatchModel(String rgbColor, String skuId, String color) {
		super();
		this.rgbColor = rgbColor;
		this.skuId = skuId;
		this.color = color;
	}
	
	
}
