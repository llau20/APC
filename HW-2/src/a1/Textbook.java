package a1;

public class Textbook extends Book {
	private String subject;
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}



	@Override
	public String getInfo() {
		return super.getInfo() + " Subject: " + subject; //+ String.format(" Subject: %s", subject);
	}
}
