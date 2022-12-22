package van.bai4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai4 {
    private static int num = 0;
    public static void main(String[] args) {
        Bai4 bai4 = new Bai4();
        Map<String, OrderInfo> map = bai4.setDataToObject();
        bai4.showListOrder(map);

        bai4.inputData(map);
        bai4.showListOrder(map);

    }

    private void inputData(Map<String, OrderInfo> map) {
        String stopProgram;
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        do{

            System.out.println("Nhap thong tin lenh: ");
            System.out.println("Symbol: ");
            String symbol = scanner.next();
            System.out.println("Quantity: ");
            int quantity = scanner.nextInt();
            System.out.println("Price: ");
            float price = scanner.nextFloat();
            System.out.println("Match Price: ");
            float matchPrice = scanner.nextFloat();
            System.out.println("Status: ");
            String status = scanner.next();
            num++;
            map.put("TC" + num, new OrderInfo(symbol, price,quantity,matchPrice,status));

            System.out.println("Dừng nhập lệnh? (nhập Y nếu muốn dừng) ");
            stopProgram = scanner.next();

        }while (!stopProgram.equals("Y"));
    }

    private void showListOrder(Map<String, OrderInfo> map) {
        for (Map.Entry<String, OrderInfo> entry : map.entrySet()) {
            OrderInfo orderInfo = entry.getValue();
            System.out.println("Testcase: " + entry.getKey() + "|| Symbol: " + orderInfo.getSymbol() + "|| Status: " + orderInfo.getStatus());
        }
    }

    private Map<String, OrderInfo> setDataToObject() {
        Map<String, OrderInfo> map = new LinkedHashMap<String, OrderInfo>();

        String testcaseName = "TC";
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setSymbol("TPB");
        orderInfo.setPrice(41.5f);
        orderInfo.setQuantity(500);
        orderInfo.setMatchPrice(41.8f);
        orderInfo.setStatus("Filled");
        num = num + 1;
        map.put(testcaseName + num, orderInfo);

        orderInfo = new OrderInfo();
        orderInfo.setSymbol("VND");
        orderInfo.setPrice(36.8f);
        orderInfo.setQuantity(1000);
        orderInfo.setMatchPrice(36.5f);
        orderInfo.setStatus("Partially Filled ");
        num = num + 1;
        map.put(testcaseName + num, orderInfo);
        return map;
    }
}
