package a1;

public class Publication {
	private String title;
	private int year;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}



	public String getInfo() {
		return title + ", published in " + year;
	}

}
