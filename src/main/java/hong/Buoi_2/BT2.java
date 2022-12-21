package Buoi_2;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        float banKinh = in.nextFloat();

       double ChuVi= chuVi(banKinh);
       System.out.println("Chu Vi Hình Tròn là: "+ChuVi);
       double DienTich = DienTich(banKinh);
       System.out.println("Diện tích hình tròn là: "+DienTich);
//
//        double ChuViHinhTron = (banKinh * 2) * Math.PI;
//        System.out.println("Chu Vi Hình Tròn là: " + ChuViHinhTron);
//
//        double DienTichHinhTron = Math.PI * (banKinh * banKinh);
//        System.out.println("Diện Tích Hình Tròn là: " + DienTichHinhTron);
    }
        public static double chuVi(float banKinh){
            double ChuVi = (banKinh * 2) * Math.PI;
            return ChuVi;
        }
        public static double DienTich(float banKinh){
            double DienTich = Math.PI * (banKinh * banKinh);
            return DienTich;
        }

}
