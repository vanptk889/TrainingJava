package thuypham.Collection;

import java.util.*;

public class ThuyBaiTap1 {

    public static void main(String[] args) {
        List<String> listSymbol = new ArrayList<>();
        listSymbol.add("MBB");
        listSymbol.add("TCB");
        listSymbol.add("VCB");
        listSymbol.add("TPB");
        listSymbol.add("VPB");
        listSymbol.add("OCB");

        int length = listSymbol.size();

        // C1: vòng for. get(): truy cập ngẫu nhiên các phần tử của Array list. Sao lại là ngẫu nhiên?
        System.out.println("Hiển thị các phần tử, dùng for: ");
        for (int i = 0; i < length; i++) {
            System.out.print(listSymbol.get(i) + "\t");
        }

        // C2: vòng for cải biến: được sử dụng để lặp mảng(array) hoặc collection
        System.out.println("\n\nHiển thị các phần tử, dùng for cải biến: ");
        for (String element : listSymbol) {
            System.out.print(element + "\t");
        }

        //C3: Iterator: truy cập tuần tự các phần tử của Array list
        System.out.println("\n\nHiển thị các phần tử, dùng Iterator: ");
        Iterator<String> iterator = listSymbol.iterator(); // Tạo một đối tượng của Iterator

        while (iterator.hasNext()) { //hasNext() trả về true nếu có phần tử tiếp theo trong Array list.
            System.out.print(iterator.next() + "\t"); //next() trả về phần tử tiếp theo trongArray list.
        }

        //C4: ListIterator
        System.out.println("\n\nHiển thị các phần tử, dùng ListIterator: ");
        ListIterator<String> listIterator = listSymbol.listIterator();

        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "\t");
        }

        //Thay đổi VPB=BID
        listSymbol.set(4, "BID");
        System.out.println("\n\nHiển thị các phần tử sau khi update VPB=BID: ");
        for (String element : listSymbol) {
            System.out.print(element + "\t");
        }

        //Xóa BID
        listSymbol.remove(4);
        System.out.println("\n\nHiển thị các phần tử sau khi xóa BID: ");
        for (String element : listSymbol) {
            System.out.print(element + "\t");
        }

        //Hiển thị list từ phần tử cuối đến phần tử đầu tiên
        System.out.println("\n\nHiển thị list từ phần tử cuối đến phần tử đầu tiên: ");
        for (int i = listSymbol.size() - 1; i >= 0; --i) {
            System.out.print(listSymbol.get(i) + "\t");
        }

        //Hiển thị list theo thứ tự tăng dần bảng chữ cái
        Collections.sort(listSymbol);
        System.out.println("\n\nHiển thị list theo thứ tự tăng dần bảng chữ cái: ");
        for (String element : listSymbol) {
            System.out.print(element + "\t");
        }

    }

}
