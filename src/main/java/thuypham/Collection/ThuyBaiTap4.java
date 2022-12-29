package thuypham.Collection;

import java.util.*;

public class ThuyBaiTap4 {
    static List<String> listSymbol = new ArrayList<>(); //Khai báo list là biến toàn cục? Why? //khai báo biến static. Nếu ko thì sẽ bị mất giá trị khi...

    public static void main(String[] args) {
        Map<String, OrderInfo> map = new LinkedHashMap<>();
        OrderInfo orderInfo = new OrderInfo(); //khới tạo đối tượng
        orderInfo.setSymbol("TPB");
        orderInfo.setPrice(41.5f);
        orderInfo.setQuantity(500);
        orderInfo.setMatchPrice(41.8f);
        orderInfo.setStatus("Filled");


        map.put("ID1",orderInfo);
//        Iterator<Map.Entry<String, OrderInfo>> iterator = map.entrySet().iterator();

//        System.out.println("Các entry có trong mapLanguages là: "); --bôi đen --> Ctrl/
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//            iterator.
//        }
//        static  //dùng static để giá trị ko bị mất đi, ko cần khởi tạo đối tượng
        listSymbol.add(orderInfo.getSymbol());
        orderInfo = new OrderInfo(); //reset đối tượng
        orderInfo.setSymbol("VND");
        orderInfo.setPrice(36.8f);
        orderInfo.setQuantity(1000);
        orderInfo.setMatchPrice(36.5f);
        orderInfo.setStatus("Partially Filled");


        map.put("ID2",orderInfo);
        listSymbol.add(orderInfo.getSymbol());
        //// hiển thị danh sách lệnh bao gồm ID lệnh, Symbol và trạng thái của lệnh
        System.out.println("OrderId, "+"Symbol, "+"Trạng thái");

        Set<Map.Entry<String, OrderInfo>> set = map.entrySet();
        for (Map.Entry<String, OrderInfo> orderInfoEntry : set ){ //orderInfoEntry là map
            String key = orderInfoEntry.getKey(); //hàm getKey của map
            OrderInfo value = orderInfoEntry.getValue(); //gán giá trị cho đối tượng value, ko cần khới tạo đối tượng value nữa. value là đối tượng
            System.out.println(key+", "+value.getSymbol()+", "+value.getStatus());

        }

        //thêm 2 lệnh mới vào trong Map
        System.out.println("\nNhập thêm lệnh:");
        Scanner scanner = new Scanner(System.in);
        String inputOrderId;
        String inputSymbol;
        float inputPrice;
        int inputQuantity;
        float inputMatchPrice;
        String inputStatus;

        for (int i=1; i<=2;i++){
            orderInfo = new OrderInfo();
            System.out.println("\nNhập thông tin của lệnh thứ " + (i+2));
            System.out.print("Nhập OrderId: ");
            inputOrderId = scanner.next();
            System.out.print("Nhập Symbol: ");
            inputSymbol = scanner.next();
            System.out.print("Nhập Price: ");
            inputPrice = scanner.nextFloat();
            System.out.print("Nhập Quantity: ");
            inputQuantity = scanner.nextInt();
            System.out.print("Nhập MatchPrice: ");
            inputMatchPrice = scanner.nextFloat();
            System.out.print("Nhập Status: ");
            inputStatus = scanner.next();

            if (listSymbol.contains(inputSymbol)){
                System.out.println("Mã này đã tồn tại.");
            }
            else {
                System.out.println("Thêm thành công.");
                orderInfo.setSymbol(inputSymbol);
                orderInfo.setPrice(inputPrice);
                orderInfo.setQuantity(inputQuantity);
                orderInfo.setMatchPrice(inputMatchPrice);
                orderInfo.setStatus(inputStatus);
                map.put(inputOrderId,orderInfo);
                listSymbol.add(orderInfo.getSymbol());
            }

        }

        System.out.println("Danh sách lệnh sau khi thêm:");
        System.out.println("Symbol, "+"Giá đặt, "+"Khối lượng, "+"Giá khớp, "+"Trạng thái");
        for (Map.Entry<String, OrderInfo> orderInfoEntry : set ){ //orderInfoEntry là map
            String key = orderInfoEntry.getKey(); //hàm getKey của map
            OrderInfo value = orderInfoEntry.getValue(); //gán giá trị cho đối tượng value, ko cần khới tạo đối tượng value nữa. value là đối tượng
            System.out.println(key+", "+value.getSymbol()+", "+value.getPrice()+", "+value.getQuantity()+", "+value.getMatchPrice()+", "+value.getStatus());

        }
        boolean checkExits = false;
        //Kiểm tra xem mã “VND” có tồn tại trong danh sách hay ko
        for (Map.Entry<String, OrderInfo> orderInfoEntry : set ){ //orderInfoEntry là map
                String key = orderInfoEntry.getKey(); //hàm getKey của map
                OrderInfo value = orderInfoEntry.getValue();
                if (value.getSymbol().equals("VND")){
                    System.out.println("\nTồn tại Lệnh đặt VND với khối lượng "+value.getQuantity()+", giá đặt "+value.getPrice());
                    checkExits = true;
                    break;
                }

        }
        if (!checkExits){
            System.out.println("\nChưa có NĐT nào đặt lệnh với mã VND.");
        }




    }







}
