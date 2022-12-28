package Lession4;

import java.util.*;

public class B4_exercise6 {
    public static void main(String[] args) {
        Map<String, List> topCK = new LinkedHashMap<>();
        B4_exercise6 b4_exercise6 = new B4_exercise6();
        topCK.putAll(b4_exercise6.inputData());
        b4_exercise6.printList(topCK);

//Thêm mã ck vào danh mục
        b4_exercise6.updateListSymbol(topCK, "steels", "NKG");
        System.out.println("Danh mục mã CK sau khi thêm mã CK mới: ");
        b4_exercise6.printList(topCK);

// Xóa mã CK khỏi danh mục
        b4_exercise6.deleteSymbol(topCK, "banks", "LPB");
        System.out.println("Danh mục mã CK sau khi xóa mã CK mới: ");
        b4_exercise6.printList(topCK);

        // Thay mã CK A bằng mã B
        b4_exercise6.replaceSymbol(topCK, "APS ", "FTS");
        System.out.println("Danh mục mã CK sau khi đổi mã CK: ");
        b4_exercise6.printList(topCK);

    }


    public Map<String, List> inputData() {
        Scanner in = new Scanner(System.in);
        Map<String, List> inputMap = new LinkedHashMap<String, List>();
        System.out.println("Điền số danh mục muốn nhập: ");
        int noDM = in.nextInt();
        for (int k = 0; k < noDM; k++) {
            List<String> listCK = new LinkedList<String>();
            System.out.print("Nhập danh mục: ");
            String key = in.next();
            System.out.print("Số mã chứng khoán muốn nhập là: ");
            int i = in.nextInt();
            for (int j = 0; j < i; j++) {
                System.out.println("Nhập mã chứng khoán: ");
                String symbol = in.next();
                listCK.add(symbol);
            }
            inputMap.put(key, listCK);
        }
        return inputMap;
    }

    public void printList(Map<String, List> inputMap) {

        Set<Map.Entry<String, List>> set = inputMap.entrySet();
        for (Map.Entry<String, List> map : set) {
            String maDM = map.getKey();
            List valuePrint = map.getValue();
            System.out.println("Danh mục: " + maDM);
            System.out.println("List mã CK trong danh mục tương ứng: ");
            Iterator<String> iterator = valuePrint.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        }
    }

    public void updateListSymbol(Map<String, List> inputMap, String danhMuc, String newSymbol) {
        Set<Map.Entry<String, List>> set = inputMap.entrySet();
        for (Map.Entry<String, List> map : set) {
            String maDM = map.getKey();
            List listSymbol = map.getValue();
            if (maDM.contains(danhMuc)) {
                listSymbol.add(newSymbol);
                inputMap.replace(maDM, listSymbol);
            }
        }
    }

    public void deleteSymbol(Map<String, List> inputMap, String danhMuc, String symbol) {
        Set<Map.Entry<String, List>> set = inputMap.entrySet();
        for (Map.Entry<String, List> map : set) {
            String maDM = map.getKey();
            List listSymbol = map.getValue();
            if (maDM.contains(danhMuc)) {
                listSymbol.remove(symbol);
                inputMap.replace(maDM, listSymbol);
            }
        }
    }

    public void replaceSymbol(Map<String, List> inputMap, String oldsymbol, String newSymbol) {
        Set<Map.Entry<String, List>> set = inputMap.entrySet();
        for (Map.Entry<String, List> map : set) {
            String maDM = map.getKey();
            List listSymbol = map.getValue();
            if (listSymbol.contains(oldsymbol)) {
                listSymbol.remove(oldsymbol);
                listSymbol.add(newSymbol);
                inputMap.replace(maDM, listSymbol);
            }
        }
    }
}
