package com.luvina.libary.entities;

public class Document {
	protected int documentId;
	protected String publisherName;
	protected int amountOfReissue;
	
	public Document() {
		
	}

	public Document(int documentId, String publisherName, int amountOfReissue) {
		super();
		this.documentId = documentId;
		this.publisherName = publisherName;
		this.amountOfReissue = amountOfReissue;
	}

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public int getAmountOfReissue() {
		return amountOfReissue;
	}

	public void setAmountOfReissue(int amountOfReissue) {
		this.amountOfReissue = amountOfReissue;
	}
	

}
