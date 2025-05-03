package a3;

public class Lamp implements Switchable, Dimmable {

	boolean on;
	int brightness;
	
	@Override
	public void setBrightness(int level) {
		// TODO Auto-generated method stub
		if(on) {
			if (level >= 0 && level <= MAX_BRIGHTNESS) {
				brightness = level;
			} else {
				
			}
		} else {
			
		}
	}

	@Override
	public int getBrightness() {
		// TODO Auto-generated method stub
		return brightness;
	}

	@Override
	public void dimToHalf() {
		// TODO Auto-generated method stub
		setBrightness(MAX_BRIGHTNESS/2);
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		on = true;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		on = false;
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return on;
	}

}
