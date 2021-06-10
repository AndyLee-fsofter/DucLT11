package com.luvina.photo.title;

import java.util.List;

import com.luvina.photo.image.Photo;

public class Title {
	private String titleId;
	private String titleName;
	private String createDate;
	private List<Photo> photos;
	public String getTitleId() {
		return titleId;
	}
	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public List<Photo> getPhotos() {
		return photos;
	}
	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
	public Title(String titleId, String titleName, String createDate) {
		super();
		this.titleId = titleId;
		this.titleName = titleName;
		this.createDate = createDate;
	}
	
	
}
