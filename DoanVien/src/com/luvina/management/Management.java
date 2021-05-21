package com.luvina.management;

import java.util.ArrayList;
import java.util.Scanner;

import com.luvina.doanvien.DoanVien;

public class Management {
	ArrayList<DoanVien> listDoanVien = new ArrayList<DoanVien>();

	Scanner sc = new Scanner(System.in);

	public Management(ArrayList<DoanVien> listDoanVien) {
		this.listDoanVien = listDoanVien;
	}

	public void inRaCacDoanVienCoDiemLonHonGiaTriNhapVao() {
		System.out.println("nhập vào điểm:");
		int mark = Integer.parseInt(sc.nextLine());
		System.out.println("danh sách các đoàn viên có điểm XL lớn hơn " + mark + "là : ");
		for (int i = 0; i < listDoanVien.size(); i++) {
			if (listDoanVien.get(i).getDiemXL() >= mark) {
				System.out.println(listDoanVien.get(i).toString());
			}
		}
	}

}
