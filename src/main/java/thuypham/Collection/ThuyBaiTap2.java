package thuypham.Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ThuyBaiTap2 {
    public static void main(String[] args) {
        Set<String> setKhoa = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập khoa đầu tiên: ");
        String khoa = scanner.next();
        setKhoa.add(khoa);
        //Thêm 1 khoa
        System.out.print("Nhập khoa cần thêm: ");
        String themKhoa = scanner.next();
        /*if (themKhoa.equals(khoa)) {
            System.out.println("Khoa " + themKhoa + " đã có trong set");
        } else {
            setKhoa.add(themKhoa);
            System.out.println("Thêm thành công!");
            System.out.println("Danh sách khoa sau khi thêm: " + khoa +", " + themKhoa);
        }*/
        if (setKhoa.contains(themKhoa)) {
            System.out.println("Khoa " + themKhoa + " đã có trong set!");
        } else {
            setKhoa.add(themKhoa);
            System.out.println("Thêm thành công!");
            System.out.println("Danh sách khoa sau khi thêm: " + setKhoa);
        }
        //Xóa 1 khoa
        System.out.print("Nhập khoa cần xóa: ");
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
