package tech;

public class Pixel {

	private String color;
	
	public Pixel() {
		this.color = "White"; //default color
	}

	public Pixel(String color) {
		this.color = color;
	}

	public void setPixel(String color) {
		this.color = color;
	}
	
	//dinamic polymorphism
	@Override
	public String toString() {
		String result = "Pixel has the color: " + this.color;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		Pixel pixel = (Pixel) obj;
		if (this.color.equals(pixel.color)) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}
}
