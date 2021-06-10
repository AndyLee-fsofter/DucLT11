package com.luvina.main;

import com.luvina.management.TitleManagement;
import com.luvina.photo.title.Title;

public class Main {

	public static void main(String[] args) {
		Title t1 = new Title("CD1","Siêu xe","25/10/2017");
		Title t2 = new Title("CD2","Cây thuốc","25/10/2017");
		Title t3 = new Title("CD3","Động vật ăn thịt","25/10/2017");
		TitleManagement tm = new TitleManagement();
		tm.addNewTitle(t1);
		tm.addNewTitle(t3);
		tm.addNewTitle(t2);
		tm.deletePhotoByPhotoId("HA11", "CD1");
	}

}
