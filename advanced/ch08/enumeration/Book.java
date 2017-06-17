public enum Book {
	JHTP("Java How to program", "2015"),
	CHTP("C How to Program", "2015"),
	IW3HTP("Internet and World Wide Web How to Program", "2012");


	private final String title;
	private final String copyrightYear;


	Book(String title, String copyrightYear) {
		this.title = title;
		this.copyrightYear = copyrightYear;
	}


	public String getTitle () {
		return title;
	}

	public String getCopyrightYear() {
		return copyrightYear;
	}
}