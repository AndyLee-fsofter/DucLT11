package com.luvina.dao;

public class Management {
	String phoneBook[] = new String[5];

	// a. constructor không tham số
	public Management() {
		super();
	}
	//constructor có 1 tham số để truyền vào giá trị cho mảng
	public Management(String[] phoneBook) {
		this.phoneBook = phoneBook;
	}

	// b. phương thức kiểm tra tồn tại
	public boolean testExist(String phoneBook) {
		//khởi tạo 1 biến boolean ketqua và gán giá trị cho nó bằng false
		boolean ketqua = false;
//		 duyệt từ đầu đến cuối mảng 
		for (int i = 0; i < this.phoneBook.length; i++) {
			//nếu chuỗi sdt truyền vào có tồn tại trong chuỗi phonebook thì gán kq = true
			if (this.phoneBook[i].indexOf(phoneBook) == -1) {
				continue;
			} else {
				ketqua = true;
				break;
			}
		}
		return ketqua;
	}

	// c. phương thức thêm danh bạ
	public void addPhoneBook(int index, String gtTen, String gtSdt) {
		//khởi tạo một đối tượng listDB Stringbuilder
		StringBuilder listDB = new StringBuilder();
		//sử dụng hàm kiểm tra tồn tại bên trên kiểm tra gtsdt truyền vào, nếu trả về true thì in ra dòng thông báo
		//sdt này đã tồn tại
		if (testExist(gtSdt)) {
			System.out.println("this phone phone book was exists");
			//nếu trả về false thì gán gtSdt và ten vào danh bạ theo index và in ra thông báo
		} else {
			phoneBook[index] = listDB.append(gtTen).append(gtSdt).toString();
			System.out.println("add phonebook succeeed");
		}
	}

	// d. phương thức sửa danh bạ
	public void fixPhoneNumber(String phoneNumber, String newPhoneNumber) {
		boolean test = testExist(newPhoneNumber);
		if (test) {
			System.out.println("can not fix this phone number because of duplicate phone number");
		} else {
			for (int i = 0; i < phoneBook.length; i++) {
				if (phoneBook[i].indexOf(phoneNumber) != -1) {
					StringBuilder fixPhoneNumber = new StringBuilder(phoneBook[i]);
					phoneBook[i] = fixPhoneNumber.delete(fixPhoneNumber.indexOf(phoneNumber), phoneBook[i].length() - 1)
							.append(newPhoneNumber).toString();
					break;
				}
			}
			System.out.println("add phone book succeed");
		}
	}

	// e.phương thức tìm kiếm danh bạ
	public boolean compareDigitOf2String(String string1, String string2) {
		boolean result = false;
		StringBuilder compareString = new StringBuilder(string1);
		StringBuilder originalString = new StringBuilder(string2);
		while (compareString.toString() != "" && originalString.toString() != "") {
			char compare = compareString.charAt(0);
			compareString.deleteCharAt(0);
			if (originalString.indexOf(String.valueOf(compare)) != -1) {
				originalString.delete(0,originalString.indexOf(String.valueOf(compare))+1 );
			} else {
				break;
			}
		}
		if ( compareString.toString() == "") {
			result = true;
		}

		return result;
	}

	public void findPhoneBook(String gtTen) {
		System.out.println("kết quả tìm kiếm :");
		for (int i = 0; i < phoneBook.length; i++) {
			if (compareDigitOf2String(gtTen, phoneBook[i])) {
				System.out.println(phoneBook[i]);
			}
		}
	}
}
