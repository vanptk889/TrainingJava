package linhhoang.BTBuoi1;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class BT2 {
    public static long tienGui;
    public String Date1;
    public String Date2;

    public static void main(String args[]) {
        BT2 tinhLaiSuat = new BT2();
        tinhLaiSuat.printMsg();

        LocalDate cvdate1 = LocalDate.parse(tinhLaiSuat.Date1);
        LocalDate cvdate2 = LocalDate.parse(tinhLaiSuat.Date2);
        Duration diff = Duration.between(cvdate1.atStartOfDay(), cvdate2.atStartOfDay());
        long durationDay = diff.toDays();
        double ls = BT2.ls(tinhLaiSuat.tienGui,durationDay);
        long TienLai = (long) (tinhLaiSuat.tienGui*ls/365*durationDay);
        System.out.println( "Số ngày gửi của khách hàng :"+ durationDay);
        System.out.println("Tiền lãi dự kiến :" + TienLai);
        System.out.println("Lãi suất tương ứng :" + ls);
    }
    public void printMsg() {
        Scanner in = new Scanner( System.in );
        System.out.print( "Nhập số tiền gửi: " );
        tienGui = in.nextLong();
        System.out.print( "Nhập ngày giao dịch: " );
        Date1 = in.next();
        System.out.print( "Nhập ngày kết thúc: " );
        Date2 = in.next();
    }
    private static double ls(long tienGui, long durationDay) {
        double ls = 0.00;
        if (tienGui < 10000000000l) {
            if (durationDay < 2) {
                ls = 0.001d;
            } else if (durationDay < 7) {
                ls = 0.0575d;
            } else if (durationDay < 14) {
                ls = 0.065d;
            } else if (durationDay < 21) {
                ls = 0.07d;
            } else if (durationDay < 30) {
                ls = 0.075d;
            } else if (durationDay < 60) {
                ls = 0.083d;
            } else if (durationDay < 90) {
                ls = 0.085d;
            } else {
                ls = 0.087d;
            }
        }
        if (tienGui >= 10000000000l) {
            if (durationDay < 2) {
                ls = 0.001d;
            } else if (durationDay < 7) {
                ls = 0.0575d;
            } else if (durationDay < 14) {
                ls = 0.067d;
            } else if (durationDay < 21) {
                ls = 0.072d;
            } else if (durationDay < 30) {
                ls = 0.077d;
            } else if (durationDay < 60) {
                ls = 0.085d;
            } else if (durationDay < 90) {
                ls = 0.087d;
            } else {
                ls = 0.089d;
            }
        }
        return ls;
    }
}
