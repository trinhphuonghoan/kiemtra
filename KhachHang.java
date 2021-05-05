package kiemtra;

import java.util.Scanner;

public class KhachHang extends KhachHangab {	
		String makhachhang;
		String tenkhachhang;
		String sdt;
		Scanner sr = new Scanner(System.in);
		public void nhapThongTin() {
			System.out.println("Nhap ma khach hang:");
			makhachhang = sr.nextLine();
			System.out.println("Nhap ten khach hang:");
			tenkhachhang = sr.nextLine();
			System.out.println("Nhap so dien thoai:");
			sdt = sr.nextLine();
		}
		public void xuatThongTin() {
			System.out.println("Ma khach hang:" + makhachhang);
			System.out.println("Ten khach hang:" + tenkhachhang);
			System.out.println("So dien thoai:" + sdt);
		}
		
	@Override
	public void NhapThongTin() {
		KhachHang kh = new KhachHang();
		kh.nhapThongTin();
	}
	@Override
	public void XuatThongTin() {
		KhachHang kh = new KhachHang();
		kh.xuatThongTin();
	}
	public static void main(String[] args) {
		KhachHang kh = new KhachHang();
		kh.nhapThongTin();
		kh.xuatThongTin();
	}
}
