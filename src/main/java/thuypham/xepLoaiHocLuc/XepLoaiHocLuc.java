package thuypham.xepLoaiHocLuc;

import java.util.Scanner;

public class XepLoaiHocLuc {

    public static void main(String[] args) {
        XepLoaiHocLuc xepLoaiHocLuc = new XepLoaiHocLuc();
        float diem = xepLoaiHocLuc.inputDiem();
        String danhGia = xepLoaiHocLuc.xepLoai(diem);
        xepLoaiHocLuc.printMsg(danhGia);

    }

    public float inputDiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem: ");
        float inputDiem = scanner.nextFloat();
        return inputDiem;
    }

    public String xepLoai(float diem) {
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
        return xepLoai;
    }

    public void printMsg(String xepLoai) {
        System.out.print("Xếp Loại: " + xepLoai);
        }

}
