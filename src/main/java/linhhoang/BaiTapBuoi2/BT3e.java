package linhhoang.BaiTapBuoi2;

public class BT3e {
    public static int position = 0;
    public static String A[] = new String[]{"VND", "BSR", "TCB", "TPB", "MBB", "MBS", "SSI","HPG"};
    public static String B = "MBB";
    public static void main(String[] args) {
        BT3e BT3 = new BT3e();
        BT3.Position(A);
        System.out.println("Vị trí của phần tử B trong mảng A là " + (position+1));
    }
    public int Position(String arr[]) {
        do {
            if (arr[position].equals(B)) {
                break;
            }
            position++;
        } while (position < arr.length);
        return position;
    }
}
