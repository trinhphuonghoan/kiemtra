package kiemtra;

import java.util.Scanner;

public class HoaDon {
	public static void main(String[] args) {
		HoaDon hd = new HoaDon();
		hd.NhapHoaDon();
		hd.InHoaDon();
	}
	String soHoaDon;
	String ngayBan;
	String tenKH;
	Scanner sc  = new Scanner(System.in);
	public void NhapHoaDon() {
		System.out.println("Nhap so hoa don:");
		soHoaDon = sc.nextLine();
		System.out.println("Nhap ngay ban:");
		ngayBan = sc.nextLine();
		System.out.println("Nhap ten khach hang:");
		tenKH = sc.nextLine();
	}
	public void InHoaDon() {
		System.out.println("So hoa don:" + soHoaDon);
		System.out.println("Ngay ban:" + ngayBan);
		System.out.println("Ten khach hang:" + tenKH);
	}
}
