package com.luvina.main;

import com.luvina.entities.HinhChuNhat;
import com.luvina.entities.HinhVuong;
import com.luvina.entities.TuGiac;

public class Main {

	public static void main(String[] args) {
		//ta có thể khai báo hình vuông hoặc hcn là 1 tứ giác
		TuGiac tg1 = new HinhVuong();
		
		
		//khai báo cụ thế
		
		HinhChuNhat hcn = new HinhChuNhat();
		HinhVuong hv = new HinhVuong();
		
		//hv, hcn có thể sử dụng phương thức inTT của lớp cha, thể hiện tính kế thừa
		hv.inTT();
		hcn.inTT();
		
		//tg1, tg2 thì không thể sử dụng các phương thức của các lớp hình vuông hình chữ nhật  vì ta quản lí nó như 1 tứ giác
		tg1.tinhChieuDaiCanh();
		
		//ta có thể sử dụng các method của hv, hcn với các đối tượng tg1, tg2, tuy nhiên phải ép kiểu
		((HinhVuong)tg1).tinhChieuDaiCanh();
		//tuy tg1 ta định hình nó là hình vuông nhưng ta hoàn toàn có thể ép về kiểu hình chữ nhật và không xảy ra lỗi trong compile time
		// tuy nhiên khi chạy chương trình thì nó sẽ xảy ra 1 exception trong runtime, vậy thì việc ép kiểu như vậy là không được
		//((HinhChuNhat)tg1).tinhChieuDaiChieuRong();
		
		//kiểm tra xem hv có phải là 1 tứ giác hay không:
		
		System.out.println(hv instanceof TuGiac);
		
		
		
		
		
		

	}

}
