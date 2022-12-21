package linhhoang.BaiTapBuoi2;

import java.text.DecimalFormat;
import java.util.Scanner;
public class BT5 {
    public static double p1, p2, s1,s2, t;
    public static int r;
    public static void main(String[] args) {
        BT5 Bt5 = new BT5();
        Bt5.printMsg();
        DecimalFormat df = new DecimalFormat("#.##");
        double s = BT4a.tinhChuVi(Bt5.r);
        if (p1 < p2) {
            t = s/((60/p1)-(60/p2));
        } else {
            t = s/((60/p2)-(60/p1));
        }
        s1 = (60/p1)*t;
        s2 = (60/p2)*t;
        System.out.println("Độ dài quãng đường 1 vòng là: " + df.format(s) + " km");
        System.out.println("Hai người sẽ gặp nhau sau " + df.format(t) +" giờ");
        System.out.println("Người thứ nhất chạy được " + df.format(s1/s) +" vòng thì gặp người thứ hai");
        System.out.println("Người thứ hai chạy được " + df.format(s2/s) +" vòng thì gặp người thứ nhất");
    }
    public static void printMsg() {
        Scanner in = new Scanner(System.in);
        System.out.print("Bán kính hình tròn là: ");
        r = in.nextInt();
        System.out.print("Tốc độ chạy của người thứ nhất là: ");
        p1 = in.nextFloat();
        System.out.print("Tốc độ chạy của người thứ hai là: ");
        p2 = in.nextFloat();
    }
}
