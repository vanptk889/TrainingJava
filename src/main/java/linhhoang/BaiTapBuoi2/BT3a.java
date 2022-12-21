package linhhoang.BaiTapBuoi2;

public class BT3a {
    public static void main(String[] args) {
        String A[] = {"VND", "BSR", "TCB", "TPB", "MBB", "MBS", "SSI","HPG"};
        String B = "MBB";
        int i = 0;
        do {
            if (A[i].equals(B)) {
                break;
            } ;
            i++;
        } while (i < A.length);
        System.out.println("Vị trí của phần tử B trong mảng A là " + (i+1));
    }
}
