package a3;

public class LampDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lamp lamp = new Lamp();
		
		//turn on, set brightness to 80, call dimToHalf(), print the brightness
		
		lamp.turnOn();
		
		lamp.setBrightness(80);
		
		lamp.dimToHalf();
		
		System.out.println("Brightness: " + lamp.getBrightness());
	}

}
