package B3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
//Khai báo 1 Set có Class triển khai là HashSet, kiểu dữ liệu là String.
//Sau đó thêm vào phần tử là tên của các khoa của một trường đại học cho Set này (giá trị của các phần tử được nhập từ bàn phím).
//Hiển thị các phần tử vừa nhập có trong Set vừa nhập sử dụng Iterator.
//Thêm vào một khoa mới vào trong Set, nếu tên khoa đó đã tồn tại thì thông báo cho người dùng biết tên khoa đó đã có,
//còn ngược lại thêm bình thường và thông báo "Thêm thành công!".
//Xóa một khoa bất kỳ ra khỏi Set. Kiểm tra nếu khoa cần xóa có tồn tại trong Set thì mới xóa và thông báo "Xóa thành công!",
//ngược lại thông báo "Xóa không thành công!".

public class B3_set {
    static Set<String> hashsetString = new HashSet<>();
    static Set<String> draftSet= new HashSet<>();


    public static void main(String[] args) {
        printMsg();
        hashsetString.addAll(draftSet);
        System.out.println("Danh sách khoa của trường đại học: ");
        printSet(hashsetString);
        printMsg();
        if (hashsetString.containsAll(draftSet)){
            System.out.println("Khoa "+draftSet+" đã tồn tại trong Set");
        } else {
            hashsetString.addAll(draftSet);
            System.out.println("Thêm mới khoa thành công! ");
            System.out.println("Danh sách khoa của trường đại học: ");
            printSet(hashsetString);
        };
        deleteSet(hashsetString);

    }
    private static void printMsg() {
       draftSet.clear();
        Scanner in = new Scanner( System.in);
        System.out.print( "Nhập khoa mới của trường " );
//        setList.add(in.next());
        draftSet.add(in.next());
    }
    private static void printSet(Set<String> setList) {
        Iterator<String> iterator = null;
        iterator = setList.iterator();
        while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
}
    private static void deleteSet(Set<String> setList)
    {
        draftSet.clear();
        Scanner in = new Scanner( System.in);
        System.out.print( "Nhập khoa muốn xóa " );
        draftSet.add(in.next());
        if (setList.containsAll(draftSet)){
            setList.remove(in.next());
            System.out.println("Khoa "+draftSet+" đã được xóa thành công");
        } else {
            System.out.println("Xóa không thành công!");
        }
    }
}
