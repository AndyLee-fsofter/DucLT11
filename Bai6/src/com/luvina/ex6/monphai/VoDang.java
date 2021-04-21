package com.luvina.ex6.monphai;

public class VoDang extends MonPhai {

	public void giangDao() {
		System.out.println("đạo nghĩa giang hồ là...");
	}
	@Override
	public void luyenCong(String vuKhi,String kiNangLuyen) {
		System.out.println("luyện "+kiNangLuyen);
		System.out.println("luyện bằng "+vuKhi);

	}
	
	@Override
	public void eat(String doAn, String thoiGian, String diaDiem) {
		System.out.println("ăn " + doAn);
		System.out.println("ăn ở "+diaDiem);
		System.out.println("ăn lúc "+thoiGian);
	}
}
