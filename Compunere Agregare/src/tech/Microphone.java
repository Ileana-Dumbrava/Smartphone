package tech;

public class Microphone {
	private int maxVolume;
	private int crtVolume;
	
	public Microphone(int maxVolume) {
		this.maxVolume = maxVolume;
		this.crtVolume = maxVolume / 4;
	}
	
	public Microphone(int maxVolume, int crtVolume) {
		this.maxVolume = maxVolume;
		this.crtVolume = crtVolume;
	}
	
	public boolean increaseVolume() {
		if (crtVolume < maxVolume) {
			crtVolume += 1;
			return true;
		}
		return false;
	}
	
	public boolean decreaseVolume() {
		if (crtVolume > 0) {
			crtVolume -= 1;
			return true;
		}
		return false;
	}
	
	public void muteMicrophone() {
		crtVolume = 0;
	}

	public int getCrtVolume() {
		return crtVolume;
	}

	public int getMaxVolume() {
		return maxVolume;
	}
	
}