package BTString;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        BT1 bt1 = new BT1();
        System.out.println("ID lệnh là: " + bt1.inputData());
        bt1.checkId();
    }
    public String inputData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập ID lệnh: ");
        String inputData = in.next();
        return inputData;
    }
    public void checkId() {
        List<String> listNumber = new LinkedList<>();
        listNumber.add("1");
        listNumber.add("2");
        listNumber.add("3");
        listNumber.add("4");
        listNumber.add("5");
        listNumber.add("6");
        listNumber.add("7");
        listNumber.add("8");
        listNumber.add("9");
        if ((inputData().length() == 7)) {
            if (inputData().matches("D.(.*)")) {

            }
        }
        else {
            System.out.println("Nhập lại lệnh");
        }
    }
}

