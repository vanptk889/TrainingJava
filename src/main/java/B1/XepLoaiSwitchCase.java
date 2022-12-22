package B1;

import java.util.Scanner;

public class XepLoaiSwitchCase {
    public int inputDiemSo;

    public static void main(String[] args) {
        XepLoaiSwitchCase xepLoai = new XepLoaiSwitchCase();
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
        switch (diemSo)
        {
            case 10:
            case 9:
                phanLoai = "giỏi";
                break;
            case 8:
                phanLoai = "khá giỏi";
                break;
            case 7:
                phanLoai = "khá";
                break;
            case 6:
                phanLoai = "trung bình khá";
                break;
            case 5:
                phanLoai = "trung bình";
                break;
            default:
                phanLoai = "dưới trung bình";
                break;
        }
        return phanLoai;
    }
}