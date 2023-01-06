package linhhoang.BT6;

import java.util.*;

public class BT6 {
    public static void main(String[] args) {
        Map<String, List> topCK = new LinkedHashMap<>();
        BT6 bt6 = new BT6();
        topCK = bt6.inputData();
        bt6.printList(topCK);
    }

    private void printList(Map<String, List> inputMap) {
        Set<Map.Entry<String, List>> set = inputMap.entrySet();
        for (Map.Entry<String, List> map : set) {
            String maDM = map.getKey();
            List valuePrint = map.getValue();
            System.out.println(" Danh mục: " + maDM);
            System.out.println("List mã CK trong danh mục tương ứng: ");
            Iterator<String> iterator = valuePrint.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

    private Map<String, List> inputData() {
        Scanner in = new Scanner(System.in);
        Map<String, List> inputMap = new LinkedHashMap<>();
        System.out.println("Số danh mục muốn nhập: ");
        int numDM = in.nextInt();
        for (int k = 0; k < numDM; k++) {
            List<String> listCK = new LinkedList<>();
            System.out.println("Nhập danh mục: ");
            String key = in.next();
            System.out.println("Số mã CK muốn nhập là: ");
            int i = in.nextInt();
            for (int j = 0; j < i; j++) {
                System.out.println("Nhập mã CK: ");
                String symbol = in.next();
                listCK.add(symbol);
            }
            inputMap.put(key, listCK);
        }
        return inputMap;
    }
}
