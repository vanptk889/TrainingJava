package thuypham.xepLoaiHocLuc;

import java.util.Scanner;

public class XepLoaiKdhSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap diem: ");
        int diem= in.nextInt();
        switch (diem){
            case 9:
                System.out.println("Xếp loại: Giỏi");
                break;
            case 8:
                System.out.println("Xếp loại: Khá Giỏi");
                break;
            case 7:
                System.out.println("Xếp loại: Khá");
                break;
            case 6:
                System.out.println("Xếp loại: Trung bình Khá");
                break;
            case 5:
                System.out.println("Xếp loại: Trung bình");
                break;
            default:
                System.out.println("Không xếp loại");
                break;
        }
    }

}
