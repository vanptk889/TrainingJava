package linhhoang.BTBuoi1;

import java.util.Scanner;

public class BT1b {
    public static int diemTB;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Diem trung binh: ");
        diemTB = in.nextInt();
        switch (diemTB) {
            case 9:
                System.out.println("Xep loai: Gioi");
                break;
            case 8:
                System.out.println("Xep loai: Kha Gioi");
                break;
            case 7:
                System.out.println("Xep loai: Kha");
                break;
            case 6:
                System.out.println("Xep loai: Trung binh kha");
                break;
            default:
                System.out.println("Xep loai: Trung binh");
        }

    }
}
