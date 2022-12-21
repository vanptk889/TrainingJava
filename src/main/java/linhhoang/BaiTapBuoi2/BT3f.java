package linhhoang.BaiTapBuoi2;

public class BT3f {
    public static int position;
    public static String A[] = {"VND", "BSR", "TCB", "TPB", "MBB", "MBS", "SSI", "HPG"};
    public static String B = "MBB";
    public static void main(String[] args) {
        BT3f BT3 = new BT3f();
        BT3.Position(A);
        if (position == A.length) {
            System.out.println("Không có phần tử B trong mảng A");
        }
            else {
                System.out.println("Vị trí của phần tử B trong mảng A là " + (position+1));
            }
        }
    public int Position(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(B)) {
                position = i;
                break;
            }
            else {
                position = arr.length;
            }
        }
        return position;
    }
}
