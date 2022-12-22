package B2;

public class B2_001 {
    // VND, BSR, TCB, TPB, MBB, MBS, SSI, HPG
    static String arrA[] = new String[] {"VND", "BSR", "TCB", "TPB", "MBB", "MBS", "SSI", "HPG"};
    static String B = "HPG";
    static int position;
    public static void main(String[] args) {
        if (viTriPhanTu(arrA)==0){
            System.out.println("Phần tử " +B +" không tồn tại trong mảng A ");}
        else {System.out.println("Phần tử " +B +" là phần tử thứ " + viTriPhanTu(arrA) +" trong mảng A");}
        }


    public  static int viTriPhanTu(String arr[]) {

       // Dùng for
        for (int i = 0; i<arr.length; i ++) {
            if (arr[i] == B) {
                position=i+1;
            }
        }

        // dùng do while
//        int i = 0;
//        do {
//            if (arr[i] == B) {
//                position=i+1;
//            }
//            i++;
//        } while (i<arr.length);
//
//        // dùng while
//        int j =0;
//        while (j<arr.length)
//        {if (arr[j] == B) {
//                position=j+1;}
//            j++;
//        }

        return position;
    }
}
