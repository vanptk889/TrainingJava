package B1;

import java.util.Scanner;

public class XepLoai {
    public int inputDiemSo;

    public static void main(String[] args) {
        XepLoai xepLoai = new XepLoai();
        xepLoai.printMsg();
        String aa = xepLoai.PhanLoai(xepLoai.inputDiemSo );
        System.out.println("Điểm số xếp loại "+ aa);

    }

    private void printMsg() {
        Scanner in = new Scanner( System.in );
        System.out.print( "Nhap diem so: " );
        inputDiemSo = in.nextInt();
    }

    private String PhanLoai(int diemSo) {
        String phanLoai = "Chưa xếp loại ";
        if ( diemSo >= 9 ) {
            phanLoai = "giỏi";
        } else if ( diemSo >= 8 ) {
            phanLoai = "khá giỏi";
        } else if ( diemSo >= 7 ) {
            phanLoai = "khá";
        } else if ( diemSo >= 6 ) {
            phanLoai = "trung bình khá";
        } else if ( diemSo >= 5 ) {
            phanLoai = "trung bình";
        } else {
            phanLoai = "dưới trung bình";
        }
        return phanLoai;
    }
}