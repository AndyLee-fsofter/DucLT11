package com.luvina.ex6.monphai;

public class ThieuLam extends MonPhai {

	public void tungKinh() {
		System.out.println("nam mô a di đà phật...");
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
