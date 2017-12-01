package pl.coderslab.web;

public class Quote {
	
	private String author;
	private String quote;
	
	public Quote(String author, String quote) {
		super();
		this.author = author;
		this.quote = quote;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}
	
	
	

}
