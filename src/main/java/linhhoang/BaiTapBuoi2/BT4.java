package linhhoang.BaiTapBuoi2;
import java.util.Scanner;

public class BT4 {
    public static double r;
    public static void main(String[] args) {
        BT4 hinhTron = new BT4();
        hinhTron.printMsg();
        float chuVi = (float) (2*3.14*r);
        float dienTich = (float) (3.14*(r*r));
        System.out.println("Chu vi hình tròn là:" + chuVi);
        System.out.println("Diện tích hình tròn là:" + dienTich);
    }
    public void printMsg() {
        Scanner in = new Scanner( System.in );
        System.out.print( "Bán kính hình tròn là: " );
        r = in.nextLong();
    }
}
