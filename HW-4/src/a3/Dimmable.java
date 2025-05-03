package a3;

public interface Dimmable {

	int MAX_BRIGHTNESS = 100;
	
	void setBrightness(int level);
	
	int getBrightness();
	
	void dimToHalf();
}
