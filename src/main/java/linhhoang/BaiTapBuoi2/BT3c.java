package linhhoang.BaiTapBuoi2;

public class BT3c {
    public static void main(String[] args) {
        String A[] = new String[] {"VND",  "BSR", "TCB", "TPB", "MBB", "MBS", "SSI", "HPG"};
        String B = "MBB";
        for (int i = 0; i < A.length; i++) {
            if (A[i].equals(B)) {
                System.out.println("Vị trí của phần tử B trong mảng A là " + (i+1));
            }
        }
    }
}
