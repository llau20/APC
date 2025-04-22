package a1;

public class Book extends Publication {
	String author;
	
	@Override 
	public String getInfo() {
		return title + ", published in " + year + ", by " + author;
	}
	
	




	
}
