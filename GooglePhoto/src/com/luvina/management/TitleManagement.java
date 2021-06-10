package com.luvina.management;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.luvina.photo.title.Title;

public class TitleManagement {
	private List<Title> titles;

	public TitleManagement() {
		titles = new ArrayList<Title>();
	}

	public boolean addNewTitle(Title title) {
		try {
			boolean isExist = false;
			for (int i = 0; i < titles.size(); i++) {
				if (titles.get(i).equals(title)) {
					System.out.println("title is existed");
					isExist = true;
					break;
				}
			}
			if (isExist) {
				titles.add(title);
				return true;
			} else {
				return false;
			}

		} catch (NullPointerException e) {
			titles.add(title);
			return true;
		}

	}

	/**
	 * phương thức này dùng để sửa tên 1 chủ đề đã có trong ds chủ đề
	 * 
	 * @param oldName
	 * @param newName
	 */
	public boolean editTitleName(String oldName, String newName) {
		try {
			boolean isExist = false;
			for (int i = 0; i < titles.size(); i++) {
				if (titles.get(i).getTitleName().equals(oldName)) {
					titles.get(i).setTitleName(newName);
					titles.get(i).setCreateDate(String.valueOf(LocalDate.now()));
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
			e.printStackTrace();
			System.out.println("chưa tồn tại tên cần sửa");
			return false;
		}
	}
	
	public boolean deleteTitileById(String titleId) {
		try {
			boolean isExist = false;
			for (int i = 0; i < titles.size(); i++) {
				if (titles.get(i).getTitleId().equals(titleId)) {
					titles.remove(i);
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
	public boolean deletePhotoByPhotoId(String photoId, String titleId) {
		try {
			boolean isExist = false;
			for (int i = 0; i < titles.size(); i++) {
				if (titles.get(i).getTitleId().equals(titleId)) {
					for (int j = 0; j < titles.get(i).getPhotos().size(); j++) {
						if (titles.get(i).getPhotos().get(j).getImgId().equals(photoId)) {
							titles.get(i).getPhotos().remove(j);
							isExist = true;
							break;
						}
					}
				break;
				}
			}
			if (isExist) {
				return true;
			} else {
				System.err.println("không có hình ảnh nào");
				return false;
			}
		} catch (NullPointerException e) {
			System.err.println("không có hình ảnh nào");
			return false;
		}
	}
}
