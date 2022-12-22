package B1;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class TinhLaiSuat {
   public long inputTienGui;
    public String inputStartDate;
    public String inputEndDate;

    public static void main(String[] args) {
        TinhLaiSuat tinhLaiSuat = new TinhLaiSuat();
        tinhLaiSuat.printMsg();
        LocalDate convertStartDate = LocalDate.parse( tinhLaiSuat.inputStartDate);
        LocalDate convertEndDate = LocalDate.parse( tinhLaiSuat.inputEndDate );
        Duration diff = Duration.between( convertStartDate.atStartOfDay(), convertEndDate.atStartOfDay() );
        //long durationDate=diff.toDays();
        double LaiSuat = TinhLaiSuat.laiSuat( tinhLaiSuat.inputTienGui , diff.toDays());
        long TienLai = (long) (tinhLaiSuat.inputTienGui * LaiSuat / 100 /365 * diff.toDays());
        System.out.println( "Số ngày gửi của khách hàng :"+ diff.toDays());
        System.out.println("Tiền lãi dự kiến :" + TienLai);
        System.out.println("Lãi suất tương ứng :" + LaiSuat);
    }

//    public long tinhSoNgayGui(String ngayKetThuc){
//
//        LocalDate date1 = LocalDate.parse(ngayKetThuc);
//
//        // get current date
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDateTime now = LocalDateTime.now();
//        LocalDate date2 = LocalDate.parse(dtf.format(now));
//
//        Duration diff = Duration.between(date2.atStartOfDay(), date1.atStartOfDay());
//        return diff.toDays();
//    }

    public void printMsg() {
        Scanner in = new Scanner( System.in );
        System.out.print( "Nhập số tiền gửi: " );
        inputTienGui = in.nextLong();
        System.out.print( "Nhập ngày giao dịch: " );
        inputStartDate = in.next();
        System.out.print( "Nhập ngày kết thúc: " );
        inputEndDate = in.next();
    }

//Tính Lãi suất
    private static double laiSuat(long TienGui, long DurationDate) {
        double LaiSuat = 0.00;
        if (TienGui>=10000000000l) {
            if (DurationDate >=90) {
                LaiSuat = 8.9;
            } else if ( DurationDate >=60 ) {
                LaiSuat = 8.7;
            } else if ( DurationDate >=30 ) {
                LaiSuat = 8.5;
            } else if ( DurationDate >=21 ) {
                LaiSuat = 7.7;
            } else if ( DurationDate >=14 ) {
                LaiSuat = 7.2;
            } else if ( DurationDate >=7 ) {
                LaiSuat = 6.7;
            } else if ( DurationDate >=2 ) {
                LaiSuat = 5.75;
            } else if ( DurationDate >=1 ){
                LaiSuat = 0.1;
            } else { LaiSuat = 0.0;};

        } else {
            if (DurationDate >=90) {
                LaiSuat = 8.7;
            } else if ( DurationDate >=60 ) {
                LaiSuat = 8.5;
            } else if ( DurationDate >=30 ) {
                LaiSuat = 8.3;
            } else if ( DurationDate >=21 ) {
                LaiSuat = 7.5;
            } else if ( DurationDate >=14 ) {
                LaiSuat = 7.0;
            } else if ( DurationDate >=7 ) {
                LaiSuat = 6.5;
            } else if ( DurationDate >=2 ) {
                LaiSuat = 5.75;
            } else if ( DurationDate >=1 ){
                LaiSuat = 0.1;
            } else { LaiSuat = 0.0;};
        }

            return LaiSuat;
        }

}
