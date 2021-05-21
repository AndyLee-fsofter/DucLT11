package com.luvina.main;

import java.util.ArrayList;

import com.luvina.doanvien.DoanVien;
import com.luvina.management.Management;

public class Main {
	public static void main(String[] args) {
		DoanVien d1= new DoanVien();
		DoanVien d2= new DoanVien();
		DoanVien d3= new DoanVien();
		DoanVien d4= new DoanVien();
		DoanVien d5= new DoanVien();
		d1.intput("Duc", "lp12", 6);
		d2.intput("Tra", "lp11", 7);
		d3.intput("Huyen", "lp10", 8);
		d4.intput("My", "lp12", 9);
		d5.intput("Khanh", "lp12", 10);
		
		ArrayList<DoanVien> lisDoanViens = new ArrayList<DoanVien>();
		lisDoanViens.add(d5);
		lisDoanViens.add(d4);
		lisDoanViens.add(d3);
		lisDoanViens.add(d2);
		lisDoanViens.add(d1);
		
		Management m = new Management(lisDoanViens);
		m.inRaCacDoanVienCoDiemLonHonGiaTriNhapVao();
				
	}
}
