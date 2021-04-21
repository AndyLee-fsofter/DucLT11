package com.luvina.ex6.monphai;

import com.luvina.ex6.skill.Skill;

public abstract class MonPhai {
	protected String tenMonPhai;
	protected String tenTruongMon;
	protected Skill[] kiNang;
	protected String noiO;
	protected String monQuy;
	protected String moTa;

	public abstract void luyenCong(String vuKhi, String kiNangLuyen);

	public abstract void eat(String doAn, String thoiGian, String diaDiem);

	public void input(String teMonPhai, String tenTruongMon, Skill[] kinang, String noiO, String monQuy, String moTa) {
		this.tenMonPhai = teMonPhai;
		this.tenTruongMon = tenTruongMon;
		this.kiNang = kinang;
		this.noiO = noiO;
		this.monQuy = monQuy;
		this.moTa = moTa;

	}

	public void display() {
		System.out.println(tenMonPhai);
		System.out.println(tenTruongMon);
		System.out.println(kiNang);
		System.out.println(noiO);
		System.out.println(moTa);
		System.out.println(monQuy);
	}

	public void tiThi(String tenMonPhai) {
		System.out.println("so sánh sát thương kĩ năng của 2 môn phải");
		System.out.println("in ra môn phái chiến thắng");
	}

}
