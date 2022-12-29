package thuypham.xepLoaiHocLuc;

import java.util.Scanner;

public class XepLoaiKoDungHam {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Nhap diem: ");
        float diem = in.nextFloat();
        String xepLoai;
        if (diem>=9) {
            xepLoai = "Giỏi";
        } else if (diem>=8) {
            xepLoai = "Khá giỏi";
        } else if (diem>=7){
            xepLoai = "Khá";
        } else if (diem>=6){
            xepLoai = "Trung bình khá";
        } else {
            xepLoai = "Trung bình";
        }

        System.out.print("Xep Loai: " + xepLoai);
    }

}
