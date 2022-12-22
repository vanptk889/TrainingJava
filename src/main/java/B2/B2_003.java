package B2;

import java.util.Scanner;

public class B2_003 {
    public static  String dealID ;

    public static void main(String[] args) {
        printMsg();
        boolean testSoKyTu;
        //check số ký tự
        if ( dealID.length() == 7 ) {
            testSoKyTu = true;
        } else {
            testSoKyTu = false;
        }


        // check chữ cái bắt đầu = D
        boolean testKyTuDauTien;
        if ( dealID.startsWith( "D" ) ) {
            testKyTuDauTien = true;
        } else {
            testKyTuDauTien = false;
        }

        //check các ký tự còn lại là số 1-9
        boolean testDinhDangSo = true ;
        for (int i = 0; i <= dealID.length() - 2; i++) {
            String phanSo = dealID.substring( 1 );
            if ( !Character.isDigit( phanSo.charAt( i ) ) ) {
                testDinhDangSo = false;
                break;
            }
        }

        if ( testKyTuDauTien  && testSoKyTu && testDinhDangSo) {
            System.out.println( "Chuỗi nhập vào đúng định dạng" );
        } else {
            System.out.println( "Chuỗi nhập vào sai định dạng" );
        }
    }


    private static void printMsg() {
        Scanner in = new Scanner( System.in );
        System.out.print( "Nhap dealID cần kiểm tra: " );
        dealID = in.next();

    }
}