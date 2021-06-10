package com.luvina.management;

import java.util.ArrayList;

import com.luvina.photo.image.CarPhoto;

public class CarPhotoManagement {
	ArrayList<CarPhoto> carPhotos;
	
	public void displayCar(CarPhoto carPhoto) {
		System.out.println(carPhoto);
	}
	
	public void searchSameCarPhoto(CarPhoto carPhoto) {
		ArrayList<CarPhoto> result = new ArrayList<CarPhoto>();
		try {
			for (int i = 0; i < carPhotos.size(); i++) {
				if (carPhoto.getBrand().equals(carPhotos.get(i).getBrand()) 
						|| Math.abs( Double.parseDouble(carPhoto.getPrice()) - Double.parseDouble(carPhotos.get(i).getPrice())) < 10 ) {
					result.add(carPhotos.get(i));
				}
			}
		} catch (NullPointerException | NumberFormatException e) {
			// TODO: handle exception
		} finally {
			try {
				for (int i = 0; i < result.size();i++) {
					if (i < 5) {
						System.out.println(result.get(i));
					} else {
						break;
					}
				}
			} catch (NullPointerException e2) {
				System.err.println("không có kết quả nào phù hợp");
			}
		
		}
		
	}
}
