package tech;

import java.util.ArrayList;

public class Screen {
	private ArrayList<Pixel> pixels;
	private Dimensions dimensions;

	public Screen(int noOfPixels, int width, int length, int depth) {
		this.pixels = new ArrayList<Pixel>(noOfPixels);
		for (int i = 0; i < noOfPixels; i++) {
				pixels.add(new Pixel());
		}
		this.dimensions = new Dimensions(width, length, depth);
	}

	public void setPixel(int indexOfPixel, String color) {
		this.pixels.get(indexOfPixel).setPixel(color);
	}

	public void colorScreen(String color) {
		for (int i = 0; i < this.pixels.size(); i++) {
			this.pixels.get(i).setPixel(color);
		}
	}
	
	public int getSize() {
		return this.pixels.size();
	}

	public void displayPixelCollection() {
		System.out.println(pixels);
	}
}
