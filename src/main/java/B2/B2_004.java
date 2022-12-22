package B2;

import java.util.Scanner;


public class B2_004 {
    public static float p1, p2, s1,s2, t;
    public static void main(String[] args) {
        B2_004 Bt5 = new B2_004();
        Bt5.printMsg();
        if (p1 < p2) {
            t = 3/((60/p1)-(60/p2));
        } else {
            t = 3/((60/p2)-(60/p1));
        }
        s1 = (60/p1)*t;
        s2 = (60/p2)*t;
        float v1 = s1/3;
        float v2 = s2/3;
        System.out.println("Hai người sẽ gặp nhau sau " + t +" giờ");
        System.out.println("Người thứ nhất chạy được " + v1 +" vòng thì gặp người thứ hai");
        System.out.println("Người thứ hai chạy được " + v2 +" vòng thì gặp người thứ nhất");
    }
    public void printMsg() {
        Scanner in = new Scanner(System.in);
        System.out.print("Tốc độ chạy của người thứ nhất là: ");
        p1 = in.nextFloat();
        System.out.print("Tốc độ chạy của người thứ hai là: ");
        p2 = in.nextFloat();
    }
}
