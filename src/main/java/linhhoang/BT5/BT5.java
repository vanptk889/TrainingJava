package linhhoang.BT5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class BT5 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("thuyquynh", "12345678");
        map.put("vanpham", "23457890");
        print(map);
        map.replace("thuyquynh","123456789");
        System.out.println("Danh sách mới: ");
        print(map);
    }

    public static void print (Map < String, String > mapName){
        Set<Map.Entry<String, String>> set = mapName.entrySet();
        for (Map.Entry<String, String> map : set) {
                String key = map.getKey();
                String value = map.getValue();
                System.out.println("username: " + key + ", password: " + value);
        }
    }
}