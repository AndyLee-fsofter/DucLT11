package com.luvina.libary.entities;

import java.time.LocalDate;

public class NewsPaper extends Document{
	private LocalDate reissueDay;

	public NewsPaper(LocalDate reissueDay,int documentId, String publisherName, int amountOfReissue) {
		super();
		this.reissueDay = reissueDay;
	}

	public LocalDate getReissueDay() {
		return reissueDay;
	}

	public void setReissueDay(LocalDate reissueDay) {
		this.reissueDay = reissueDay;
	}
	
	

}
