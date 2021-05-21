package com.luvina.doanvien;


public class DoanVien {
	private String name;
	private String chiDoan;
	private int diemXL;
	
	
	public int getDiemXL() {
		return diemXL;
	}

	
	@Override
	public String toString() {
		return "DoanVien [name=" + name + ", chiDoan=" + chiDoan + ", diemXL=" + diemXL + "]";
	}

	public void intput(String name, String chiDoan, int diemXL) {
		this.name = name;
		this.chiDoan = chiDoan;
		this.diemXL = diemXL;
	}
	
	public void output() {
		String ttDoanVien = name+ " ," + chiDoan + " ," + diemXL;
		System.out.println(ttDoanVien);
	}
	

}
