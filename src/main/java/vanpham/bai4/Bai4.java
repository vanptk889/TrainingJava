package vanpham.bai4;

import java.util.*;
//Tạo 1 Map lưu trữ ID của từng lệnh và thông tin lệnh, ID tự sinh ra.

// hiển thị danh sách lệnh bao gồm ID lệnh, Symbol và trạng thái của lệnh.

// thêm 2 lệnh mới vào trong Map -  user nhập từ bàn phím

// nếu mã đó đã tồn tại trong list lệnh thì thông báo mã đã tồn tại, ngược lại thêm vào bình thường và thông báo "Thêm thành công". Nếu status nhập vào khác các giá trị [New,Pending New, Partially Filled

//        Filled, Reject, Canceled] thì trả thông báo lỗi “Trạng thái không hợp lệ, mời nhập lại trạng thái”.

// in lại danh sách sau khi đã thêm lệnh mới. In theo thứ tự chèn lệnh.

// Kiểm tra xem mã “VND” có tồn tại trong danh sách hay ko, có thì in ra thông báo “Tồn tại Lệnh đặt VND với khối lượng xxx, giá đặt yyy ”. Không tồn tại trong danh sách thì in ra thông báo “Chưa có NĐT nào đặt lệnh với mã VND”

// In tất cả các lệnh có trạng thái Filled/Partially Filled

// Cho phép user thêm mới 5 lệnh vào danh sách, kiểm tra nếu khối lượng input sai lô thì hiển thị thông báo “Khối lượng không hợp lệ” và cho phép người dùng nhập lại dữ liệu để thêm mới lệnh vào hệ thống.

//        Chú ý: lô lẻ: từ 1-99, lô chẵn:  >=100 và chia hết cho 100

// in ra danh sách tất cả lệnh.

public class Bai4 {
    private static int num = 0;
    private static final Scanner scanner = new Scanner(System.in);
    private static List<String> listSymbol = new ArrayList<>();

    public static void main(String[] args) {


        Bai4 bai4 = new Bai4();
        Map<String, OrderInfo> map = bai4.setDataToObject();

        String stopProgram = "N";
        do {
            OrderInfo orderInfo = bai4.inputData();
            boolean isExistsSymbol = bai4.checkSymbolExist(map, orderInfo.getSymbol());
            if (!isExistsSymbol) {
                map.put("TC" + num, orderInfo);
                System.out.println("Stop program? (input Y if u want to stop)");
                stopProgram = scanner.next();
            } else {
                System.out.println("Symbol đã trùng, mời nhập lại");
            }

        } while (!stopProgram.equals("Y"));

        bai4.showListOrder(map);
        bai4.inputData();
        bai4.showListOrder(map);

    }

    private boolean checkSymbolExist(Map<String, OrderInfo> map, String symbolInput) {
        boolean existSymbol = false;
        for (OrderInfo item : map.values()) {
            if (item.getSymbol().equals(symbolInput)) {
                existSymbol = true;
            }
        }
        return existSymbol;
    }

    private boolean checkSymbolExist(String symbolInput) {
        boolean existSymbol = false;
        if (listSymbol.contains(symbolInput)) {
            existSymbol = true;
        }
        return existSymbol;
    }

    private OrderInfo inputData() {
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
        OrderInfo orderInfo = new OrderInfo(symbol, price, quantity, matchPrice, status);
        return orderInfo;
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
