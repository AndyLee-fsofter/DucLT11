package com.luvina.management;

import java.util.ArrayList;
import java.util.List;

import com.luvina.photo.image.AnimalPhoto;

public class AnimalPhotoManagement {
	private ArrayList<AnimalPhoto> animalPhotos = new ArrayList<AnimalPhoto>();

	public void makeSound(String id) {
		try {
			for (int i = 0; i < animalPhotos.size(); i++) {
				if (animalPhotos.get(i).getImgId().equals(id)) {
					System.out.println(animalPhotos.get(i).getSound());
				}
			}
		} catch (NullPointerException e) {
			System.err.println("không có động vật nào như đã nhập");
		}

	}

	public boolean compare2String(String s1, String s2) throws NullPointerException {
		int count = 0;		
			for (int i = 0; i < s1.length(); i++) {
				if (s2.contains(String.valueOf(s1.charAt(i))) && s1.charAt(i) != ' ') {
					count++;
				}
			}
			if (count >= 3) {
				return true;
			} else {
				return false;
			}
	}

	public void searchSamePhoto(String name) {
		List<AnimalPhoto> result = new ArrayList<AnimalPhoto>();
		try {
			for (int i = 0; i < animalPhotos.size(); i++) {
				if (compare2String(name, animalPhotos.get(i).getName())) {
					result.add(animalPhotos.get(i));
				}				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
