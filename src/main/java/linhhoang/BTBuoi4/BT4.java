package linhhoang.BTBuoi4;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.Set;

public class BT4 {
    public static void main(String[] args) {
        List<String> listStatus = new ArrayList<String>();
        listStatus.add("New");
        listStatus.add("Pending New");
        listStatus.add("Partially Filled");
        listStatus.add("Filled");
        listStatus.add("Reject");
        listStatus.add("Canceled");

        Map<String, OrderInfo> map = new LinkedHashMap<>();
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

        orderInfo = new OrderInfo();
        Scanner in = new Scanner(System.in);
        System.out.print("Mã CK: ");
        String symbol3 = in.nextLine();
        orderInfo.setSymbol(symbol3);
        Set<Map.Entry<String, OrderInfo>> set = map.entrySet();
        for (Map.Entry<String, OrderInfo> orderInfoEntry : set ){ //orderInfoEntry là map
            OrderInfo value = orderInfoEntry.getValue(); //gán giá trị cho đối tượng value, ko cần khới tạo đối tượng value nữa. value là đối tượng
            if (symbol3.equals(value.getSymbol())) {
                System.out.println("Mã đã tồn tại!");
                System.out.print("Nhập lại mã CK: ");
                String symbol3a = in.nextLine();
                orderInfo.setSymbol(symbol3a);
            } else {
                System.out.println("Thêm thành công!");
            }
            break;
        }
        System.out.print("Giá đặt: ");
        float price3 = in.nextFloat();
        orderInfo.setPrice(price3);
        System.out.print("Khối lượng: ");
        int volume3 = in.nextInt();
        orderInfo.setQuantity(volume3);
        System.out.print("Giá khớp: ");
        float matchedPrice3 = in.nextFloat();
        orderInfo.setMatchedPrice(matchedPrice3);
        System.out.print("Trạng thái: ");
        String status3 = in.next();
        orderInfo.setStatus(status3);
        if (listStatus.contains(status3)) {
        } else {
            System.out.println("Trạng thái không hợp lệ, mời nhập lại trạng thái: ");
            String status3a = in.next();
            orderInfo.setStatus(status3a);
        }
        map.put("TC03", orderInfo);

        orderInfo = new OrderInfo();
        System.out.print("Mã CK: ");
        String symbol4 = in.next();
        orderInfo.setSymbol(symbol4);
        for (Map.Entry<String, OrderInfo> orderInfoEntry : set ){ //orderInfoEntry là map
            OrderInfo value = orderInfoEntry.getValue(); //gán giá trị cho đối tượng value, ko cần khới tạo đối tượng value nữa. value là đối tượng
            if (symbol4.equals(value.getSymbol())) {
                System.out.println("Mã đã tồn tại!");
                System.out.print("Nhập lại mã CK: ");
                String symbol4a = in.next();
                orderInfo.setSymbol(symbol4a);
            } else {
                System.out.println("Thêm thành công!");
            }
            break;
        }
        System.out.print("Giá đặt: ");
        float price4 = in.nextFloat();
        orderInfo.setPrice(price4);
        System.out.print("Khối lượng: ");
        int volume4 = in.nextInt();
        orderInfo.setQuantity(volume4);
        System.out.print("Giá khớp: ");
        float matchedPrice4 = in.nextFloat();
        orderInfo.setMatchedPrice(matchedPrice4);
        System.out.print("Trạng thái: ");
        String status4 = in.next();
        orderInfo.setStatus(status4);

        if (listStatus.contains(status4)) {
        } else {
            System.out.println("Trạng thái không hợp lệ, mời nhập lại trạng thái: ");
            String status4a = in.next();
            orderInfo.setStatus(status4a);
        }
        map.put("TC04", orderInfo);

        System.out.println("Symbol, "+"Giá đặt, "+"Khối lượng, "+"Giá khớp, "+"Trạng thái");


        for (Map.Entry<String, OrderInfo> orderInfoEntry : set ){ //orderInfoEntry là map
            String key = orderInfoEntry.getKey(); //hàm getKey của map
            OrderInfo value = orderInfoEntry.getValue(); //gán giá trị cho đối tượng value, ko cần khới tạo đối tượng value nữa. value là đối tượng
            System.out.println(key+", "+value.getSymbol()+", "+value.getPrice()+", "+value.getQuantity()+", "+value.getMatchedPrice()+", "+value.getStatus());
        }
    }
}

