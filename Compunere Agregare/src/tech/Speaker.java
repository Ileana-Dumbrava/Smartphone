package tech;

public class Speaker {
	private int maxVolume;
	private int crtVolume;
	
	public Speaker(int maxVolume) {
		this.maxVolume = maxVolume;
		this.crtVolume = maxVolume / 4;
	}
	
	public Speaker(int maxVolume, int crtVolume) {
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
	
	//static polymorphism
	public boolean increaseVolume(int unitsForIncremental) {
		if ((crtVolume + unitsForIncremental) <= maxVolume) {
			crtVolume += unitsForIncremental;
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
	
	public void setSilenceMoce() {
		crtVolume = 0;
	}

	public int getCrtVolume() {
		return crtVolume;
	}

	public int getMaxVolume() {
		return maxVolume;
	}
	
}
