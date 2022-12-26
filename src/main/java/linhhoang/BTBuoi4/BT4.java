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

        orderInfo = new OrderInfo();
        Scanner in = new Scanner(System.in);
        System.out.print("Mã CK: ");
        orderInfo.setSymbol(in.nextLine());
        Set<Map.Entry<String, OrderInfo>> set = map.entrySet();
        for (Map.Entry<String, OrderInfo> orderInfoEntry : set ){ //orderInfoEntry là map
            OrderInfo value = orderInfoEntry.getValue(); //gán giá trị cho đối tượng value, ko cần khới tạo đối tượng value nữa. value là đối tượng
            if (orderInfo.getSymbol().equals(value.getSymbol())) {
                System.out.println("Mã đã tồn tại!");
                System.out.print("Nhập lại mã CK: ");
                orderInfo.setSymbol(in.nextLine());
            } else {
                System.out.println("Thêm thành công!");
            }
            break;
        }
        System.out.print("Giá đặt: ");
        orderInfo.setPrice(in.nextFloat());
        System.out.print("Khối lượng: ");
        orderInfo.setQuantity(in.nextInt());
        System.out.print("Giá khớp: ");
        orderInfo.setMatchedPrice(in.nextFloat());
        System.out.print("");
        orderInfo.setStatus(in.nextLine());
        System.out.print("Trạng thái: ");
        orderInfo.setStatus(in.nextLine());
        if (orderInfo.getStatus().equals(listStatus)) {
            System.out.println("Trạng thái không hợp lệ, mời nhập lại trạng thái: ");
            orderInfo.setStatus(in.nextLine());
        }
        map.put("TC03", orderInfo);

        orderInfo = new OrderInfo();
        System.out.print("Mã CK: ");
        orderInfo.setSymbol(in.nextLine());
        for (Map.Entry<String, OrderInfo> orderInfoEntry : set ){ //orderInfoEntry là map
            OrderInfo value = orderInfoEntry.getValue(); //gán giá trị cho đối tượng value, ko cần khới tạo đối tượng value nữa. value là đối tượng
            if (orderInfo.getSymbol().equals(value.getSymbol())) {
                System.out.println("Mã đã tồn tại!");
                System.out.print("Nhập lại mã CK: ");
                orderInfo.setSymbol(in.nextLine());
            } else {
                System.out.println("Thêm thành công!");
            }
            break;
        }
        System.out.print("Giá đặt: ");
        orderInfo.setPrice(in.nextFloat());
        System.out.print("Khối lượng: ");
        orderInfo.setQuantity(in.nextInt());
        System.out.print("Giá khớp: ");
        orderInfo.setMatchedPrice(in.nextFloat());
        System.out.print("");
        orderInfo.setStatus(in.nextLine());
        System.out.print("Trạng thái: ");
        orderInfo.setStatus(in.nextLine());

        if (listStatus.contains(orderInfo.getStatus())) {
            System.out.println("Trạng thái không hợp lệ, mời nhập lại trạng thái: ");
            orderInfo.setStatus(in.nextLine());
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

