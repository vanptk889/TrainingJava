import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String, List<String>> topCK = new LinkedHashMap<>();
        Test Test = new Test();
        topCK.putAll(Test.inputData());
        Test.printList(topCK);

//Thêm mã ck vào danh mục
        Test.updateListSymbol(topCK, "steels", "NKG");
        System.out.println("Danh mục mã CK sau khi thêm mã CK mới: ");
        Test.printList(topCK);

// Xóa mã CK khỏi danh mục
        Test.deleteSymbol(topCK, "banks", "LPB");
        System.out.println("Danh mục mã CK sau khi xóa mã CK mới: ");
        Test.printList(topCK);

        // Thay mã CK A bằng mã B
        Test.replaceSymbol(topCK, "APS ", "FTS");
        System.out.println("Danh mục mã CK sau khi đổi mã CK: ");
        Test.printList(topCK);

    }


    public Map<String, List<String>> inputData() {
        Scanner in = new Scanner(System.in);
        Map<String, List<String>> inputMap = new LinkedHashMap<String, List<String>>();
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

    public void printList(Map<String, List<String>> inputMap) {

        Set<Map.Entry<String, List<String>>> set = inputMap.entrySet();
        for (Map.Entry<String, List<String>> map : set) {
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

    public void updateListSymbol(Map<String, List<String>> inputMap, String danhMuc, String newSymbol) {
        Set<Map.Entry<String, List<String>>> set = inputMap.entrySet();
        for (Map.Entry<String, List<String>> map : set) {
            String key = map.getKey();
            List<String> listSymbol = map.getValue();
            List<String> test = listSymbol;
            if (key.equals(danhMuc)) {
                test.add(newSymbol);
            }
        }
    }
    
    public void deleteSymbol(Map<String, List<String>> inputMap, String danhMuc, String Symbol) {
        Set<Map.Entry<String, List<String>>> set = inputMap.entrySet();
        for (Map.Entry<String, List<String>> map : set) {
            String maDM = map.getKey();
            List listSymbol = map.getValue();
            if (maDM.contains(danhMuc)) {
                List<String> listSymbolDraft = new LinkedList<String>();
                listSymbolDraft.addAll(listSymbol);
                listSymbolDraft.remove(Symbol);
                inputMap.replace(maDM, listSymbolDraft);
            }
        }
    }

    public void replaceSymbol(Map<String, List<String>> inputMap, String oldsymbol, String newSymbol) {
        Set<Map.Entry<String, List<String>>> set = inputMap.entrySet();
        for (Map.Entry<String, List<String>> map : set) {
            String maDM = map.getKey();
            List listSymbol = map.getValue();
            if (listSymbol.contains(oldsymbol)) {
                List<String> listSymbolDraft = new LinkedList<String>();
                listSymbolDraft.addAll(listSymbol);
                listSymbolDraft.remove(oldsymbol);
                listSymbolDraft.add(newSymbol);
                inputMap.replace(maDM, listSymbolDraft);
            }
        }
    }
}
