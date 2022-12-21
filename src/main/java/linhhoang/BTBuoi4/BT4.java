package linhhoang.BTBuoi4;

import java.util.HashMap;
import java.util.Map;

public class BT4 {
    public static void main(String[] args) {
        Map<String, OrderInfo> map = new HashMap<>();
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setSymbol1("TPB");
        orderInfo.setPrice1(41.5f);
        orderInfo.setQuantity1(500);
        orderInfo.setMatchedPrice1(41.8f);
        orderInfo.setStatus1("Filled");
        map.put("TC01", orderInfo);

        orderInfo.setSymbol2("VND");
        orderInfo.setPrice2(36.8f);
        orderInfo.setQuantity2(1000);
        orderInfo.setMatchedPrice2(36.5f);
        orderInfo.setStatus2("Partially Filled");
        map.put("TC02", orderInfo);

        for (String i : map.keySet()) {
            System.out.println("key: " + i + " value: " + map.get(i));
        }
    }
}

