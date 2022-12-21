package hong.buoi_3;

import java.util.*;

public class BT1 {
    public static void main(String[] args) {

        List<String> ListString = new LinkedList<String>();
        ListString.add("MBB");
        ListString.add("TCB");
        ListString.add("VCB");
        ListString.add("TPB");
        ListString.add("VPB");
        ListString.add("OCB");

//    System.out.println("Các phần tử có trong listString là: "+ ListString);
//    --------------------------------------------------------------------------
//       Hiển thị các phần tử có trong list sử dụng for cải tiến
//        for (String s : ListString) {
//            System.out.println(s);
//        }
////---------------------------------------------------------------------------
//        sử dụng Iterator
//        Iterator<String> iterator = ListString.iterator();
//        System.out.println("Các phần tử có trong ListString là: ");
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + "\t");
//        }
//        --------------------------------------------------------------
////        Sử dụng ListIterator
//        ListIterator<String> listIterator = ListString.listIterator();
//        System.out.println("Các phần tử có trong ListString là: ");
//        while (listIterator.hasNext()) {
//            System.out.print(listIterator.next() + "\t");
//        }
//        --------------------------------------------------------------
//        Sử dụng for
//        for (int i = 0; i < ListString.size(); i++) {
//            System.out.print(ListString.get(i) + "\t" );
//        }
//        --------------------------------------
//      Thay đổi VPB = BID và hiển thị lại List sau khi thay đổi.
//        ListString.set(4, "BID ");
//        System.out.println("Các phần tử có trong listString là: " + ListString);
//        ---------------------------------------------------------------------------
//      Xóa phần tử vừa thay đổi trong List và hiển thị lại các phần tử còn lại của List.
//        ListString.remove(4);
//        System.out.println("Các phần tử có trong listString là: " + ListString);
//        -------------------------------------------------------------------------------
//      Hiển thị list theo thứ tự tăng dần bảng chữ cái.
//        Collections.sort(ListString);
//        System.out.println("Các phần tử có trong listString là: " + ListString);
//        ------------------------------------------
//      Hiển thị các phần tử của List theo thứ tự từ phần tử cuối trở về phần tử đầu tiên.
        Collections.reverse(ListString);
        System.out.println("Các phần tử có trong listString là: " + ListString);
    }
}
