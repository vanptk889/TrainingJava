package Lession4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class B4_exercise5 {
    public static void main(String[] args) {
        Map<String, String> account= new LinkedHashMap<String, String>();
        account.put("thuyquynh","12345678");
        account.put("vanpham","23457890");
        print(account);
        //change password
        account.replace("thuyquynh","123456789");
        System.out.println("Danh sach sau khi update la: ");
        print(account);
    }
    public static void print(Map<String, String> mapName){
        Set<Map.Entry<String, String>> set = mapName.entrySet();
        for (Map.Entry<String, String> map : set ){
            String key = map.getKey();
            String value = map.getValue();
            System.out.println("username: "+key+" ,password: "+value);
        }
    }
}
