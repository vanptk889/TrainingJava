package linhhoang.BTBuoi3;

import java.util.*;

public class BTBuoi3 {
    public static String i1, i2, i3, i4, i5, i6;

    public static void main(String[] args) {
        List<String> listStock = new ArrayList<String>();
        listStock.add("MBB");
        listStock.add("TCB");
        listStock.add("VCB");
        listStock.add("TPB");
        listStock.add("VPB");
        listStock.add("OCB");
        //listStock.set(4,"BID");
        //listStock.remove(4);
        //Collections.sort(listStock);
        //Collections.reverse(listStock);
        /*C1: dùng vòng for
        for (int i = 0; i < listStock.size(); i++) {
            System.out.println(listStock.get(i));
        }
         */
        /*C2: dùng for cải biến
        for (String element : listStock) {
            System.out.println(element);
        }
         */
        /*C3: dùng Iterator
        Iterator<String> iterator = listStock.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator);
        }
         */
        /*C4: dùng ListIterator
        ListIterator<String> listIterator = listStock.listIterator();
        System.out.println("Các phần tử có trong mảng là: ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + "\t");
        }
        System.out.println("Duyệt ngược từ cuối trờ về đầu danh sách: ");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous() + "\t");
        }
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Các khoa của trường là: ");
        i1 = in.next();
        i2 = in.next();
        i3 = in.next();
        i4 = in.next();
        i5 = in.next();
        Set<String> truongDaiHoc = new HashSet<>();
        truongDaiHoc.add(i1);
        truongDaiHoc.add(i2);
        truongDaiHoc.add(i3);
        truongDaiHoc.add(i4);
        truongDaiHoc.add(i5);
        List<String> list = new ArrayList<>();
        list.addAll(truongDaiHoc);
        // Thêm 1 khoa
        System.out.println("Thêm 1 khoa mới: ");
        i6 = in.next();

        for (int i = 0; i < list.size(); i++) {
            if (i6.equals(list.get(i))) {
                System.out.println("Đã tồn tại khoa trong trường!");
            } else {
                truongDaiHoc.add(i6);
                System.out.println("Thêm khoa thành công!");
            }
            break;
        }

        // Xóa 1 khoa
        /*System.out.println("Xóa khoa: ");
        i6 = in.next();
        for (int i = 0; i < list.size(); i++) {
            if (i6.equals(list.get(i))) {
                System.out.println("Xóa thành công!");
                list.remove(list.get(i));
                break;
            } else {
                System.out.println("Xóa không thành công!");
            }
        }
         */
        System.out.print("Các khoa trong trường là: ");
        Iterator<String> iterator = truongDaiHoc.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+ " ");
        }
    }
}

