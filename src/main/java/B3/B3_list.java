package B3;
/*
Khai báo list chứa danh sách các mã chứng khoán. MBB,TCB,VCB,TPB,VPB,OCB
Hiển thị các phần tử có trong List vừa nhập: sử dụng Iterator và ListIterator, for, for cải biến.
Thay đổi VPB = BID và hiển thị lại List sau khi thay đổi.
Xóa phần tử vừa thay đổi trong List và hiển thị lại các phần tử còn lại của List.
Hiển thị các phần tử của List theo thứ tự từ phần tử cuối trở về phần tử đầu tiên.
Hiển thị list theo thứ tự tăng dần bảng chữ cái.
 */
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class B3_list {

    static  List<String>  listMaCK = new ArrayList<String>();

    public static void main(String[] args) {
        listMaCK.add("MBB");
        listMaCK.add("TCB");
        listMaCK.add("VCB");
        listMaCK.add("TPB");
        listMaCK.add("VPB");
        listMaCK.add("OCB");
        inListMaCK(listMaCK);

        listMaCK.set(listMaCK.indexOf("MBB"), "BID");
        System.out.println("List mã CK sau khi đổi mã MBB thành BID");
        inListMaCK(listMaCK);

        listMaCK.remove(listMaCK.indexOf("BID"));
        System.out.println("List mã CK sau khi bỏ m BID");
        inListMaCK(listMaCK);

        Collections.reverse(listMaCK);
        System.out.println("List mã CK sau khi sắp xếp theo ");
        inListMaCK(listMaCK);

        Collections.sort(listMaCK);
        System.out.println("List mã CK sau khi đảo ngược thứ tự sắp xếp tăng dần theo bảng chữ cái ");
        inListMaCK(listMaCK);
    }


    public static void inListMaCK(List<String> danhSach) {
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println( danhSach.get(i));
        };

//        for (String element : danhSach) {
//            System.out.println("In bằng for cải biến: "+element);
//        };

    }
}

