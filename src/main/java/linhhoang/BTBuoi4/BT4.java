package linhhoang.BTBuoi4;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.Set;

public class BT4 {
    public static void main(String[] args) {
        Map<String, OrderInfo> map = new HashMap<>();
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setSymbol("TPB");
        orderInfo.setPrice(41.5f);
        orderInfo.setQuantity(500);
        orderInfo.setMatchedPrice(41.8f);
        orderInfo.setStatus("Filled");
        map.put("TC01", orderInfo);

        orderInfo = new OrderInfo();
        orderInfo.setSymbol("VND");
        orderInfo.setPrice(36.8f);
        orderInfo.setQuantity(1000);
        orderInfo.setMatchedPrice(36.5f);
        orderInfo.setStatus("Partially Filled");
        map.put("TC02", orderInfo);

        System.out.println("Symbol, "+"Giá đặt, "+"Khối lượng, "+"Giá khớp, "+"Trạng thái");

        Set<Map.Entry<String, OrderInfo>> set = map.entrySet();
        for (Map.Entry<String, OrderInfo> orderInfoEntry : set ){ //orderInfoEntry là map
            String key = orderInfoEntry.getKey(); //hàm getKey của map
            OrderInfo value = orderInfoEntry.getValue(); //gán giá trị cho đối tượng value, ko cần khới tạo đối tượng value nữa. value là đối tượng
            System.out.println(key+", "+value.getPrice()+", "+value.getQuantity()+", "+value.getMatchedPrice()+", "+value.getStatus());

        }
    }
}

