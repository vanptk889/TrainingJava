package BTString;

import java.util.*;

//Tạo 1 Map lưu trữ thông tin danh sách API sau:
//        1 - /accounts/{accountNo}/orders
//        2 - /accounts/ppse/{symbol}
//        3 - /accounts/closedPosition
//        4 - /accounts/{accountNo}/collateralSecurities
//// in ra các phần tử trong map
//// Kiểm tra nếu API tồn tại {accountNo} thì thay thế {accountNo} = 0000256841,
// nếu API tồn tại {symbol} thì thay thế {symbol} = VND
//// In lại thông tin giá trị trong map sau khi thay đổi
public class BT2 {
    public static void main(String[] args) {
        BT2 b4_exercise7 = new BT2();
        Map<String, String> api = new LinkedHashMap<String, String>();
        // khai báo list api
        api.put("1", "/accounts/{accountNo}/orders");
        api.put("2", "accounts/ppse/{symbol}");
        api.put("3", "/accounts/closedPosition");
        api.put("4", "/accounts/{accountNo}/collateralSecurities");
        b4_exercise7.printMap(api);

        // Kiểm tra nếu API tồn tại {accountNo} thì thay thế {accountNo} = 0000256841,
// nếu API tồn tại {symbol} thì thay thế {symbol} = VND
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập mã accountNo:");
        String accountNo = in.next();
        System.out.println("Nhập mã symbol: ");
        String symbol = in.next();
        //Gọi hàm thay thế accNo và symbol
        b4_exercise7.inputAccountNo(api, accountNo);
        b4_exercise7.inputSymbol(api, symbol);
        //In lại map sau khi đã thay thế
        b4_exercise7.printMap(api);
    }

    public void printMap(Map<String, String> inputMap) {
        Set<Map.Entry<String, String>> set = inputMap.entrySet();
        for (Map.Entry<String, String> map : set) {
            String key = map.getKey();
            String value = map.getValue();
            System.out.println("API thứ " + key + ": " + value);
        }
    }

    public void inputAccountNo(Map<String, String> inputMap, String accountNo) {
        Set<Map.Entry<String, String>> set = inputMap.entrySet();
        for (Map.Entry<String, String> map : set) {
            String key = map.getKey();
            String value = map.getValue();
            String draftValue = value.replace("{accountNo}", accountNo);
            inputMap.replace(key, draftValue);
        }
    }

    public void inputSymbol(Map<String, String> inputMap, String symbol) {
        Set<Map.Entry<String, String>> set = inputMap.entrySet();
        for (Map.Entry<String, String> map : set) {
            String key = map.getKey();
            String value = map.getValue();
            String draftValue = value.replace("{symbol}", symbol);
            inputMap.replace(key, draftValue);
//            map.getValue().replace("{symbol}",symbol);
        }
    }
}