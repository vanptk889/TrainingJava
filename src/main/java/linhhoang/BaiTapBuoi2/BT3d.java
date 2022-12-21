package linhhoang.BaiTapBuoi2;

public class BT3d {
    public static int position = 0;
    public static String A[] = {"VND", "BSR", "TCB", "TPB", "MBB", "MBS", "SSI", "HPG"};
    public static String B = "MBB";
    public static void main(String[] args) {
        BT3d BT3 = new BT3d();
        BT3.Position(A);
        System.out.println("Vị trí của phần tử B trong mảng A là " + (position+1));
    }
    public int Position(String arr[]) {
        while (position < arr.length) {
            if (arr[position].equals(B)) {
                break;
            } else {
                position++;
            }
        }
        return position;
    }
}
