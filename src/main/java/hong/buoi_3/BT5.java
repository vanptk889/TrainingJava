package buoi_3;

import java.util.Map;
import java.util.TreeMap;

public class BT5 {
    public static void main(String[] args){
        Map<String, Integer> mapAccount = new TreeMap<>();
        mapAccount.put("thuyquynh",12345678);
        mapAccount.put("vanpham",23457890);

        for (String key : mapAccount.keySet()) {
            Integer value = mapAccount.get(key);
            System.out.println("UserName: "+ key + " Password: " + value);
        }
        mapAccount.replace("thuyquynh",123456789);
        System.out.println(mapAccount);

    }
}
