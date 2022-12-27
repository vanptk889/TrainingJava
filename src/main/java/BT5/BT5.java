package BT5;

import linhhoang.BTBuoi4.OrderInfo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class BT5 {
    public static void main(String[] args) {
        Map<String, UserInfo> map = new LinkedHashMap<>();
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("thuyquynh");
        userInfo.setPassword("12345678");
        map.put("TC01", userInfo);

        userInfo = new UserInfo();
        userInfo.setUserName("vanpham");
        userInfo.setPassword("23457890");
        userInfo.setPassword("123456789");
        map.put("TC02", userInfo);

        System.out.println("TC, "+"UserName, "+"Password");
        Set<Map.Entry<String, UserInfo>> set = map.entrySet();
        for (Map.Entry<String, UserInfo> userInfoEntry : set ){
            String key = userInfoEntry.getKey();
            UserInfo value = userInfoEntry.getValue();
            System.out.println(key+", "+value.getUserName()+", "+value.getPassword());
        }
    }

}
