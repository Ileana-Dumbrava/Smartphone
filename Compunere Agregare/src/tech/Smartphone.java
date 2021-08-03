package tech;

import java.util.ArrayList;

public class Smartphone {
	
	  private Screen theScreen;
	  private Case theCase;
	  private Speaker theSpeaker;
	  private Microphone theMicrophone;
	 
	  public Smartphone(Screen theScreen, Case theCase, 
	                    Speaker theSpeaker, Microphone theMicrophone) {
	    this.theScreen = theScreen;
	    this.theCase = theCase;
	    this.theSpeaker = theSpeaker;
	    this.theMicrophone = theMicrophone;
	  }
	 
	  public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol, int microMaxVol) {
		  this.theScreen = new Screen(pixelsNo, width, length, depth);
		  this.theCase = new Case();
		  this.theSpeaker = new Speaker(speakerMaxVol);
		  this.theMicrophone = new Microphone(microMaxVol);
	  }
	  
	  public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol, 
	                    int speakerCrtVol, int microMaxVol, int microCrtVol) {
		this.theScreen = new Screen(pixelsNo, width, length, depth);
	    this.theCase = new Case();
	    this.theSpeaker = new Speaker(speakerMaxVol, speakerCrtVol);
	    this.theMicrophone = new Microphone(microMaxVol, microCrtVol);
	  }
	
	  public void pressVolumeUp() {
		 System.out.println("class Smartphone: delegate to Case ->");
		 this.theCase.pressVolumeUp();
		 System.out.println("class Smartphone: delegate to Speaker ->");
		 this.theSpeaker.increaseVolume();	 
	  }
		 
	  public void pressVolumeDown() {
		  System.out.println("class Smartphone: delegate to Case ->");
		  this.theCase.pressVolumeDown();
		  System.out.println("class Smartphone: delegate to Speaker ->");
		  this.theSpeaker.decreaseVolume();
	  } 
	  
	  public void setPixel(int indexOfPixel, String color) {
		  this.theScreen.setPixel(indexOfPixel, color);
	  }

	  public void colorScreen(String color) {
		  this.theScreen.colorScreen(color);
	  }
	  
	  public void increaseMicrophoneVolume() {
		  this.theMicrophone.increaseVolume();
	  }
	  
	  public void decreaseMicrophoneVolume() {
		  this.theMicrophone.decreaseVolume();
	  }
	  
	  public void muteMicrophone() {
		  this.theMicrophone.muteMicrophone();
	  }
	  
	  public int getMicrophoneMaxVolume() {
		  return this.theMicrophone.getMaxVolume();
	  }
	  
	  public int getMicrophoneCrtVolume() {
		  return this.theMicrophone.getCrtVolume();
	  }
	  
	  public void increaseSpeakerVolume() {
		  this.theSpeaker.increaseVolume();
	  }
	  
	  public void decreaseSpeakerVolume() {
		  this.theSpeaker.decreaseVolume();
	  }
	  
	  public void setSilenceMode() {
		  this.theSpeaker.setSilenceMoce();
	  }
 
	  public int getSpeakerMaxVolume() {
		  return this.theSpeaker.getMaxVolume();
	  }
	  
	  public int getSpeakerCrtVolume() {
		  return this.theSpeaker.getCrtVolume();
	  }	
	  
	  public int getSize() {
		 return this.theScreen.getSize();
	  }
	  
	  public void displayPixelCollection() {
		  this.theScreen.displayPixelCollection();
	  }

}	

