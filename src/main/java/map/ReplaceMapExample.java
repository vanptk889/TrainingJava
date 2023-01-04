package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReplaceMapExample {
    public static void main(String[] args) {
        Map<String, SymbolMD> map1 = new LinkedHashMap<>();
        SymbolMD symbol = new SymbolMD();
        symbol.setAccount("05559999997");
        symbol.setSymbol("VND");
        map1.put("1", symbol);

        symbol = new SymbolMD();
        symbol.setAccount("0001999997");
        symbol.setSymbol("TCB");
        map1.put("2", symbol);

        replaceMap1(map1, "0001555887");

        Map<String, String> map2 = new LinkedHashMap<>();
        map2.put("1", "TCB");
        map2.put("2", "VND/{account}");
        replaceMap2(map2);
    }

    private static void replaceMap2(Map<String, String> inputMap) {
        inputMap.put("2", "SSI/{account}"); // sau khi chạy dòng này thì map2 đã được update key 2 = SSI/{account}
        inputMap.replace("1", "TCB/{account}"); // sau khi chạy dòng này thì map2 đã được update key 1 = TCB/{account}
        for (Map.Entry<String, String> map : inputMap.entrySet()) {
            map.getValue().replace("{account}", "123456789"); // dòng này ko update được map1
        }
    }

    public static void replaceMap1(Map<String, SymbolMD> inputMap, String accountNo) {
        for (Map.Entry<String, SymbolMD> map : inputMap.entrySet()) {
            SymbolMD value = map.getValue();
            value.setAccount(accountNo); // sau khi chạy dòng này thì map1 đã được update value
        }
    }
}
