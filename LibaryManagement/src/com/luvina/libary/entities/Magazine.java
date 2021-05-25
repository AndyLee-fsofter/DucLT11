package com.luvina.libary.entities;

import java.time.LocalDate;

public class Magazine extends Document{
	private String reissueNumber;
	private LocalDate reissueMonth;
	public Magazine(String reissueNumber, LocalDate reissueMonth,int documentId, String publisherName, int amountOfReissue) {
		super();
		this.reissueNumber = reissueNumber;
		this.reissueMonth = reissueMonth;
	}
	public String getReissueNumber() {
		return reissueNumber;
	}
	public void setReissueNumber(String reissueNumber) {
		this.reissueNumber = reissueNumber;
	}
	public LocalDate getReissueMonth() {
		return reissueMonth;
	}
	public void setReissueMonth(LocalDate reissueMonth) {
		this.reissueMonth = reissueMonth;
	}
	

}
