package com.luvina.management;

import java.util.ArrayList;
import java.util.List;

import com.luvina.photo.image.Photo;

public class PhotoManagement {
	private List<Photo> photos;

	public PhotoManagement() {
		photos = new ArrayList<Photo>();
	}

	public boolean addPhoto(Photo photo) {
		try {
			boolean isExist = false;
			for (int i = 0; i < photos.size(); i++) {
				if (photos.get(i).equals(photo)) {
					isExist = true;
					break;
				}
			}
			if (isExist) {
				return false;
			} else {
				photos.add(photo);
				return true;
			}
		} catch (NullPointerException e) {
			photos.add(photo);
			return true;
		}

	}

	public void displayPhotobyId(String photoId) {
		try {
			for (int i = 0; i < photos.size(); i++) {
				if (photos.get(i).getImgId().equals(photoId)) {
					System.out.println(photos.get(i));
					break;
				}
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

	}
	
	public void zoomInById(String photoId) {
		try {
			for (int i = 0; i < photos.size(); i++) {
				if (photos.get(i).getImgId().equals(photoId)) {
					System.out.println("thu nhỏ" + photos.get(i).getImgName());
					break;
				}
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	public void zoomOutById(String photoId) {
		try {
			for (int i = 0; i < photos.size(); i++) {
				if (photos.get(i).getImgId().equals(photoId)) {
					System.out.println("phóng to" + photos.get(i).getImgName());
					break;
				}
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	public boolean deletePhotoById(String id) {
		try {
			boolean isExist = false;
			for (int i = 0; i < photos.size(); i++) {
				if (photos.get(i).getImgId().equals(id)) {
					photos.remove(i);
					isExist = true;
					break;
				}
			}
			if (isExist) {
				return true;
			} else {				
				return false;
			}
		} catch (NullPointerException e) {
		
			return false;
		}
	}
	
	public ArrayList<Photo> searchByName(String name){
		ArrayList<Photo> result = new ArrayList<Photo>();
		try {
			for (int i = 0; i < photos.size(); i++) {
				if (photos.get(i).getImgName().equals(name)) {
					result.add(photos.get(i));
				}
			}
			return result;
		} catch (NullPointerException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
