package org.tnsif.acc.c2tc.multipleinterface;

class SmartPhone implements Camera,MusicPlayer
{

	@Override
	public void playMusic() {
		System.out.println("Playing music on the smartphone");
		
	}

	@Override
	public void takephoto() {
		System.out.println("Taking photo using smartphone camera");
		
	}
	
}


public class MultipleInterface {

	public static void main(String[] args) {
		SmartPhone smartphone=new SmartPhone();
		smartphone.playMusic();
		smartphone.takephoto();

	}

}