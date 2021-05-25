package com.luvina.libary.entities;

public class Book extends Document{
	private String authorName;
	private int pageNumber;
	public Book(String authorName, int pageNumber,int documentId, String publisherName, int amountOfReissue) {
		super();
		this.authorName = authorName;
		this.pageNumber = pageNumber;
	}
	
	public Book() {
		super();
	}

	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	

}
