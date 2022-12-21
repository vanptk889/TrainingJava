package linhhoang.BTBuoi1;

import java.util.Scanner;

public class BT1a {
    public static float diemTB;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Diem trung binh: ");
        diemTB = in.nextFloat();
        if (diemTB >= 9) {
            System.out.println("Xep loai: Gioi");
        } else if (diemTB >= 8) {
            System.out.println("Xep loai: Kha gioi");
        } else if (diemTB >= 7) {
            System.out.println("Xep loai: Kha");
        } else if (diemTB >= 6) {
            System.out.println("Xep loai: Trung binh kha");
        } else
        {
            System.out.println("Xep loai: Trung binh");
        }
    }
}
