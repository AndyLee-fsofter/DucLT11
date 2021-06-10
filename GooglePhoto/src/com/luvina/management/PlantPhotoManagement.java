package com.luvina.management;

import java.util.ArrayList;

import com.luvina.photo.image.PlantPhoto;

public class PlantPhotoManagement {
	ArrayList<PlantPhoto> plantPhotos;
	
	public void displayNameAndUsage(PlantPhoto plantPhoto) {
		System.out.println(plantPhoto.getName() + "công dụng là: " + plantPhoto.getUsage());
	}
	
	
}
