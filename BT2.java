
package buoi_3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

    public class BT2 {
        public static void main(String[] args){
            String n,j;

            Set<String> set = new TreeSet<>();
            Scanner scanner = new Scanner(System.in);
            set.add("Welcome");
            set.add("To");
            set.add("Geeks");
            set.add("4");

            System.out.print("Nhập phần tử: ");
            n = scanner.nextLine();
            if (!set.contains(n)) {
                set.add(n);
                System.out.println("Thêm thành công");
                System.out.println("Các phần tử trong set sau khi thêm: ");
                System.out.println(set);
            } else {
                System.out.println("Phần tử " + n + " đã tồn tại");
            }

            System.out.print("Nhập phần tử cần xóa: ");
            j = scanner.nextLine();
            if (set.contains(j)) {
                set.remove(j);
                System.out.println("Xóa thành công");
            } else {
                System.out.println("Xóa không thành công");
            }


        }
    }
