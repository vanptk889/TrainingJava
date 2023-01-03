package Lession5_String;

import static javax.xml.stream.XMLStreamConstants.SPACE;

//Cho chuối ký tự sau:
//        “hoc java     co ban den nang " + "      \n cao ”
//        Remove khoảng trắng ở đầu/cuối chuỗi
//        Xử lý khoảng trắng và ký tự xuống dòng để in ra chuỗi “hoc java co ban den nang cao”
//        In ra số từ có trong chuỗi
//        In ra số ký tự của chuôi
public class StringBai3 {
    public static void main(String[] args) {
        //Nhap du lieu
        String data = "hoc java     co ban den nang " + "      \n cao ";
        //Remove khoang trang
        data = data.trim();
        //Xóa xuống dòng
        data = data.replaceAll("\n", "");
        //xóa khoảng trắng thừa
        data = data.replaceAll("\\s\\s+", " ");

        // Đếm số tu co trong chuoi
//        int no = 0;
//        for (int i = 0; i < data.length(); i++) {
//            if(data.charAt(i).equals(" ")) {
//                no=no+1;
//            }
//        }
        String draftData = data.replace(" ", "");
        if (data.length() != 0 && draftData.length() != 0) {
            int no = data.length() - draftData.length() + 1;
            System.out.println("Số từ có trong chuỗi = " + no);
        } else {
            System.out.println("Chuỗi không có từ nào");
        }
        //Đếm so ky tu co trong chuoi:
        System.out.println("Số ky tư co trong chuoi là: " + data.length());

    }

}
