package thuypham.Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ThuyBaiTap3 {

    public static void main(String[] args) {
        Set<String> setKhoa = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);
        //Nhập 1 set từ bàn phím
        System.out.println("Nhập tên khoa (input N để dừng):");
        String nhapKhoa;
        do {
            nhapKhoa = scanner.next();
            if (nhapKhoa.equals("N")) {
                System.out.println("Kết thúc input!");
            } else {
                setKhoa.add(nhapKhoa);
            }

        } while (!nhapKhoa.equals("N"));

        if (setKhoa.size() > 0) {
            System.out.println("\nCác khoa trong danh sách là: " + setKhoa);
        } else {
            System.out.println("\nChưa có khoa nào trong danh sách!");
        }

        //Thêm 1 khoa
        System.out.print("\nNhập khoa cần thêm: ");
        String themKhoa = scanner.next();
        if (setKhoa.contains(themKhoa)) {
            System.out.println("Khoa " + themKhoa + " đã có trong set!");
        } else {
            setKhoa.add(themKhoa);
            System.out.println("Thêm thành công!");
            System.out.println("Danh sách khoa sau khi thêm: " + setKhoa);
        }

        //Xóa 1 khoa
        System.out.print("\nNhập khoa cần xóa: ");
        String xoaKhoa = scanner.next();
        if (!setKhoa.contains(xoaKhoa)) {
            System.out.println("Xóa không thành công!");
        } else {
            setKhoa.remove(xoaKhoa);
            System.out.println("Xóa thành công!");
            System.out.println("Danh sách khoa sau khi xóa: " + setKhoa);
        }

    }

}
