package com.luvina.revsertint;

public class RevsertInt {
	private int soNguyen;

	//khởi tạo một constructor không tham số
		public RevsertInt() {
			super();
		}
	//khởi tạo constructor có tham số
	public RevsertInt(int soNguyen) {
		super();
		this.soNguyen = soNguyen;
	}
	//phương thức đảo ngược String
	public String reverseString(String s) {
		String reverseString = "";
		for (int i = 0; i < s.length(); i++) {
			reverseString = s.charAt(i) + reverseString;		
		}
		return reverseString;
	}
	
	//phương thức revertInt
	
	@SuppressWarnings("static-access")
	public void revertInt() {
		int n = soNguyen;	//khởi tạo 1 số nguyên n và gán giá trị cho nó bằng soNguyen
		String maNhiPhan = "";   //khởi tạo một biến maNhiPhan và gán giá trị null cho nó
		while (n > 0) {
			maNhiPhan = n % 2 + maNhiPhan;
			n /= 2;
		}
		//in ra chuỗi maNhiPhan sau khi chuyển đổi từ kiểu số nguyên
		System.out.println(maNhiPhan);
		maNhiPhan = reverseString(maNhiPhan); //đảo ngược lại chuỗi mã nhị phân
		//in ra chuỗi maNhiPhan sau khi được đảo ngược
		System.out.println(maNhiPhan);
		
		for (int i = 0; i< maNhiPhan.length(); i++) {
			//lấy ra từng giá trị theo kiểu int của dãy nhị phân
			int n1 = Integer.parseInt(maNhiPhan.valueOf(maNhiPhan.charAt(i)));
			
			//tính theo công thức
			n += n1*Math.pow(2, maNhiPhan.length()-i-1);
		}
		//in ra số n đã được revert
		System.out.println(n);

	}

}
