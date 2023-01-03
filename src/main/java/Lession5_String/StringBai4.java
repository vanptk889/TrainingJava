package Lession5_String;

public class StringBai4 {

    public static void main(String[] args) {
        String data="8=FIX.4.4|9=440|35=8|34=489|49=FIXIN02|50=-UnKnown|52=20221227-04:03:26.644|56=ROBOT|1=0001629316|6=0|11=HNX102817.753|14=0|17=122622-FIXIN02-1360-1-ROBOT-HNX102817.753|31=0|32=0|37=122622-FIXIN02-1360-1-ROBOT-HNX102817.753|38=200|39=8|40=2|44=91000|54=1|55=CAP|58=SEC:3;FEC:3;TEXT:Order exceeds limit;ADT:SubAccount 0001629316 has credit limit 1158577. Hold 18263700 failed|59=0|60=20221227-04:03:26.643|103=3|150=8|151=0|336=2|376=0001629316,200,9|788=4|10=013| ";
        int start=data.indexOf("58=")+3;
        int end=data.indexOf("59=")-1;
        System.out.println(data.substring(start,end));

    }
}
