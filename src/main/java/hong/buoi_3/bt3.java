package buoi_3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class bt3 {
    public static void main(String[] args) {
        String input = "",j;
        Scanner sc = new Scanner(System.in);
        Set<String> set = new TreeSet<>();
        do {
            System.out.print("Nhập vào tên khóa: ");
            input = sc.nextLine();

            if (!input.equals("N")) {
                if (set.add(input)) {
                    System.out.println("Thêm thành công");
                } else {
                    System.out.println(input + " đã có");
                }
            }
        } while (!input.equals("N"));
        System.out.println(set);

        System.out.print("Nhập phần tử cần xóa: ");
        j = sc.nextLine();
        if (set.remove(j)) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Xóa không thành công");
        }
    }
}



