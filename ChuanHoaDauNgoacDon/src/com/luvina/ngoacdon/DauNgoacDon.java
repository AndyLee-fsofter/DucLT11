package com.luvina.ngoacdon;

public class DauNgoacDon {
	private String ngoacDon;

	public DauNgoacDon(String ngoacDon) {
		this.ngoacDon = ngoacDon;
	}
	int count = 0;
	public void chuanHoaNgoacDon() {
		StringBuilder chuoiCanChuanHoa = new StringBuilder(ngoacDon);
		for (int i = 0; i < chuoiCanChuanHoa.length(); i++) {
			if (chuoiCanChuanHoa.charAt(i) == '(') {
				count +=1;				
			} else {
				count -=1;
				
			}
			if (count < 0) {
				chuoiCanChuanHoa.deleteCharAt(i);
				count = 0;
				i--;
			}
		
		}
	
		for (int i = chuoiCanChuanHoa.length() - 1; i >= 0; i--) {
			
			if (chuoiCanChuanHoa.charAt(i) == ')') {
				count ++;
			} else {
				count --;
			}
			if (count < 0) {
				chuoiCanChuanHoa.deleteCharAt(i);
				count = 0;
			}
		}
		System.out.println(chuoiCanChuanHoa.toString());
	}
}
