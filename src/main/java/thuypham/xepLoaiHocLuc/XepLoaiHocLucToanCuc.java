package thuypham.xepLoaiHocLuc;

import java.util.Scanner;

public class XepLoaiHocLucToanCuc{

    public String xepLoai;

    public static void main(String[] args) {
        XepLoaiHocLucToanCuc xepLoaiHocLuc = new XepLoaiHocLucToanCuc();
        float diem = xepLoaiHocLuc.inputDiem();
        xepLoaiHocLuc.xepLoai(diem);
        xepLoaiHocLuc.printMsg();

    }

    public float inputDiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem: ");
        float inputDiem = scanner.nextFloat();
        return inputDiem;
    }

    public void xepLoai(float diem) {
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
    }

    public void printMsg() {
        System.out.print("Xếp Loại: " + xepLoai);
    }













}
