package linhhoang.BaiTapBuoi2;

public class BT3b {
    public static void main(String[] args) {
        String A[] = {"VND", "BSR", "TCB", "TPB", "MBB", "MBS", "SSI","HPG"};
        String B = "HPG";
        int i = 0;
        while (i < A.length) {
            if (A[i].equals(B)) {
                System.out.println("Vị trí của phần tử B trong mảng A là " + (i+1));
                break;
            } else {
                i++;
            }
        }
    }
}
