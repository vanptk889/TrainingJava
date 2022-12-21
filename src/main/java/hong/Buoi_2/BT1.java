package Buoi_2;
import java.lang.reflect.Array;
import java.util.Arrays;

public class BT1 {
    public static void main(String[] args) {
        String arrSymbol[] = new String[]{"VND", "BSR", "TCB", "TPB", "MBB", "MBS", "SSI", "HPG"};
//        int vitricantim = timViTri(arrSymbol, "MBB");
//        System.out.println(vitricantim);
        for (int i = 0; i < arrSymbol.length - 1; i++) {
            if (arrSymbol[i].equals("MBB")) {
                System.out.println("Phần tử thứ " + i + ": " + arrSymbol[i]);
            }
        }

        int index = 0;
        while (index != arrSymbol.length) {
            if (arrSymbol[index].equals("MBB")) {
                System.out.println("Phần tử thứ " + index + ": " + arrSymbol[index]);
            }
            index ++;
        }
    //------------------------------------
        int index1 = 0;
        do {
            if (arrSymbol[index1].equals("MBB")) {
                System.out.println("Phần tử thứ " + index1 + ": " + arrSymbol[index1]);
            }
            index1 ++;
        } while (index1 != arrSymbol.length);
    }

//    public static int timViTri(String[] arr, String chuoi) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i].equals(chuoi)) {
//                return i;
//            }
//        }
//        return 0;
//    }
}