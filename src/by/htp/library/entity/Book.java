package by.htp.library.entity;

public class Book {
	String title;
	int year;
	String author;

	protected Book(String title, int year, String author) {
		this.title = title;
		this.year = year;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	public String getAuthor() {
		return author;
	}

	public void printBook() {
		System.out.println("Year: " + this.getYear() + "; Author: " + this.getAuthor() + "; Title: " + this.getTitle());
	}
}
