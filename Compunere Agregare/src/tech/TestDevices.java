package tech;

public class TestDevices {

	public static void main(String[] args) {
		
		Screen screen1 = new Screen(10, 12, 13, 3);
		System.out.println(screen1.getSize());
		screen1.displayPixelCollection();
		screen1.setPixel(1, "Black");
		screen1.displayPixelCollection();
		screen1.colorScreen("Red");
		screen1.displayPixelCollection();
		
		Smartphone smartphone1 = new Smartphone(50, 12, 14, 3, 100, 100);
		smartphone1.displayPixelCollection();
		smartphone1.setPixel(0, "Blue");
		smartphone1.displayPixelCollection();
		smartphone1.colorScreen("Yellow");
		smartphone1.displayPixelCollection();
		System.out.println(smartphone1.getSpeakerMaxVolume());
		System.out.println(smartphone1.getSpeakerCrtVolume());
		smartphone1.increaseSpeakerVolume();
		smartphone1.increaseSpeakerVolume();
		System.out.println(smartphone1.getSpeakerCrtVolume());
		smartphone1.pressVolumeUp();
		System.out.println(smartphone1.getSpeakerCrtVolume());
		smartphone1.setSilenceMode();
		System.out.println(smartphone1.getSpeakerCrtVolume());
	
	}

}
