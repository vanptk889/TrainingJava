package B4;

import java.util.*;


public class B4_map {

    //Tạo 1 Map lưu trữ ID của từng lệnh và thông tin lệnh, ID tự sinh ra.

// hiển thị danh sách lệnh bao gồm ID lệnh, Symbol và trạng thái của lệnh.

// thêm 2 lệnh mới vào trong Map (“TCB”, 54, 600, 0, “Cancelled”) và (“BID”, 51.6, 1500,0, “New”)

// nếu mã đó đã tồn tại trong list lệnh thì thông báo mã đã tồn tại

// ngược lại thêm vào bình thường và thông báo "Thêm thành công"

// in ra số thứ tự của từng lệnh ( vị trí của lệnh khi thêm vào)

// Kiểm tra xem mã “VND” có tồn tại trong danh sách hay ko, có thì in ra thông báo “Tồn tại Lệnh đặt VND với khối lượng xxx, giá đặt yyy ”. Không tồn tại trong danh sách thì in ra thông báo “Chưa có NĐT nào đặt lệnh với mã VND”

// In tất cả các lệnh có trạng thái Filled/Partially Filled

// Cho phép user thêm mới 5 lệnh vào danh sách, kiểm tra nếu khối lượng input sai lô thì hiển thị thông báo “Khối lượng không hợp lệ” và cho phép người dùng nhập lại dữ liệu để thêm mới lệnh vào hệ thống.

    // in ra danh sách tất cả lệnh.

    public static void main(String[] args) {
        B4_map b4_map=new B4_map();
        Map<String, Object> testOrder= new LinkedHashMap<String, Object>();
        Map<String, Object> testOrder_draff= new LinkedHashMap<String, Object>();
        System.out.println("Nhập order đầu tiên");
        testOrder.putAll(b4_map.inputData());
        System.out.println("Nhập order tiếp theo");
        testOrder.putAll(b4_map.inputData());
        System.out.println("Danh sách các lệnh");
        b4_map.print(testOrder);
        System.out.println("Thêm lệnh mới vào danh sách");
        // Check trùng mã khi nhập vào không
        testOrder_draff.putAll(b4_map.inputData());
        b4_map.checkDuplicateSymbol(testOrder_draff,testOrder);
        testOrder.putAll(testOrder_draff);
        testOrder_draff.clear();
        //Tìm lệnh có mã symbol = xxx
        Scanner in = new Scanner( System.in);
        System.out.println("Nhập mã bạn muốn tìm: ");
        String searchSymbol=in.next();
        b4_map.checkSymbol(testOrder,searchSymbol);
        //In lệnh có status = xxx
        System.out.println("Nhập trạng thái lệnh bạn muốn tìm: ");
        String searchStatus=in.next();
        System.out.println("Caác lệnh có trạng thái "+searchStatus+" là:");
        b4_map.checkStatus(testOrder,searchStatus);
    }
    public void checkDuplicateSymbol (Map<String,Object> map1, Map<String,Object> map2) {
Set<Map.Entry<String, Object>> set = map1.entrySet();
        for (Map.Entry<String, Object> map : set ){
            Object value1 = map.getValue();
            String symbol =((OrderInfor) value1).getSymbol();
            if (map2.containsValue(symbol)) {
                System.out.println("Mã "+symbol+" đã tồn tại");
            } else {
                System.out.println("Thêm mã "+symbol+"thành công");}
        }
    }
    public Map<String, Object> inputData(){
        Scanner in = new Scanner( System.in);
        Map<String, Object> testOrder = new LinkedHashMap<String, Object>();
        List<String> listStatus = new LinkedList<String>();
        listStatus.add("New");
        listStatus.add("Pending New");
        listStatus.add("Partially Filled");
        listStatus.add("Filled");
        listStatus.add("Reject");
        listStatus.add("Canceled");

            System.out.print( "key: " );
            String key = in.next();
            System.out.print( "nhập symbol: " );
            String symbol =in.next();
            System.out.print( "nhập giá đặt mua: " );
            Float orderPrice =in.nextFloat();
            System.out.print( "nhập số lượng: " );
            int quantity =in.nextInt();
            System.out.print( "nhập giá khớp: " );
            Float matchPrice =in.nextFloat();
            System.out.print( "nhập trạng thái lệnh: " );
            String status =in.next();
            if (listStatus.contains(status)) {
                System.out.println("Trạng thái lệnh không hợp lệ, xin mời nhập lại: ");
                status = in.next();
            }
            Object value = new OrderInfor();
            ((OrderInfor) value).setSymbol(symbol);
            ((OrderInfor) value).setOrderPrice(orderPrice);
            ((OrderInfor) value).setQuantity(quantity);
            ((OrderInfor) value).setMatchPrice(matchPrice);
            ((OrderInfor) value).setStatusOrder(status);
            testOrder.put(key,value);
//    }
        return testOrder;
    }
    public void print (Map<String,Object> testMap) {

        Set<Map.Entry<String, Object>> set = testMap.entrySet();
        for (Map.Entry<String, Object> map : set ){
            String key = map.getKey();
            Object valuePrint = map.getValue();
            String symbol =((OrderInfor) valuePrint).getSymbol();
            float orderPrice =((OrderInfor) valuePrint).getOrderPrice();
            float matchPrice =((OrderInfor) valuePrint).getMatchPrice();
            int quantity=((OrderInfor) valuePrint).getQuantity();
            String statusOrder=((OrderInfor) valuePrint).getStatusOrder();
            System.out.println("Key: "+key+" Symbol: "+symbol+" order Price: "+orderPrice+" Status: "+statusOrder);
        }}
    public void checkSymbol (Map<String,Object> testMap, String searchSymbol) {

        Set<Map.Entry<String, Object>> set = testMap.entrySet();
        for (Map.Entry<String, Object> map : set ){
//            String key = map.getKey();
            Object valuePrint = map.getValue();
            String symbol =((OrderInfor) valuePrint).getSymbol();
            if (symbol.equals(searchSymbol)) {
                int quantity=((OrderInfor) valuePrint).getQuantity();
                float orderPrice =((OrderInfor) valuePrint).getOrderPrice();
                System.out.println("Tồn tại lệnh đặt "+searchSymbol+" với số lượng "+quantity+" với giá đặt "+orderPrice);
            } else {
                System.out.println("Không tồn tại lệnh đặt có mã là "+searchSymbol);
            }
        }}

    public void checkStatus (Map<String,Object> testMap, String searchStatus) {
//        List<String> listResult = new ArrayList<String>();
        Set<Map.Entry<String, Object>> set = testMap.entrySet();
        for (Map.Entry<String, Object> map : set ){
            String key = map.getKey();
            Object valuePrint = map.getValue();
            String statusOrder=((OrderInfor) valuePrint).getStatusOrder();
            String symbol =((OrderInfor) valuePrint).getSymbol();
            float orderPrice =((OrderInfor) valuePrint).getOrderPrice();
            if (statusOrder.equals(searchStatus)){
                System.out.println("Key: "+key+" Symbol: "+symbol+" order Price: "+orderPrice+" Status: "+statusOrder);
            }
        }
    }
}
