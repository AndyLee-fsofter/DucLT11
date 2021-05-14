package com.luvina.entities;

public class PhoneBook {
	//khởi tạo 2 thuộc tính cho danh bạ
	private String name;
	private String phoneNumber;
	//constructor có 2 tham số để truyền vào giá trị cho các đối tượng
	public PhoneBook(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	//phương thức get để lấy ra tên 
	public String getName() {
		return name;
	}
	//phương thức get để lấy ra sdt
	public String getPhoneNumber() {
		return phoneNumber;
	}
	//phương thức set để sửa giá trị sdt bên ngoài class này
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//override lại phương thức toString để đối tượng phonebook trả về 1 string danh bạ 
	//bao gồm tên và số điện thoại
	@Override
	public String toString() {
		return name+phoneNumber;
	}
	

}
