package linhhoang.BaiTapBuoi2;

import java.text.DecimalFormat;
import java.util.Scanner;
public class BT4a {
    public int inputBanKinh;
    public static void main(String[] args) {
        BT4a hinhTron = new BT4a();
        hinhTron.printMsg();
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        double chuViHinhTron = hinhTron.tinhChuVi(hinhTron.inputBanKinh);
        double dienTichHinhTron = hinhTron.tinhDienTich(hinhTron.inputBanKinh);
        System.out.println("Chu vi hình tròn là:" + df.format(chuViHinhTron));
        System.out.println("Diện tích hình tròn là:" + df.format(dienTichHinhTron));
    }
    public static double tinhChuVi(int banKinh) {
        double chuVi = 2*banKinh*Math.PI;
        return chuVi;
    }
    public double tinhDienTich(int banKinh) {
        double dienTich = banKinh*banKinh*Math.PI;
        return dienTich;
    }
    public void printMsg() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        inputBanKinh = in.nextInt();
    }
}

