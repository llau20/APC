package a1;

public class Book extends Publication {
	private String author;
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override 
	public String getInfo() {
		return super.getInfo() + ", by " + author;
	}
	
	




	
}
