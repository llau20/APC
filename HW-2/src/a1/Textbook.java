package a1;

public class Textbook extends Book {
	String subject;
	
	@Override
	public String getInfo() {
		return title + ", published in " + year + ", by " + author + " Subject: " + subject;
	}
}
