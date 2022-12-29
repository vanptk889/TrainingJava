package buoi_3;

import java.util.HashMap;
import java.util.Map;
public class bt6 {
    public static void main (String[] args){
        Map<String, String> mapCk = new HashMap<>();
        mapCk.put("stocks", "VND,SSI,MBS,APS");
        mapCk.put("lands","DXG,CRE,KDH");
        mapCk.put("banks","TCB,MBB,BID,OCB,LPB,CTG");
        mapCk.put("steels", "HPG,HSG");

        for (String key : mapCk.keySet()) {
            String value = mapCk.get(key);
            System.out.println(key +" = "+ value);
        }

        mapCk.put("steels", "HPG,HSG,NGK");
        System.out.println("Danh sach sau khi them NKG" + mapCk);

        mapCk.remove("banks","LPB");
        System.out.println("Danh sach sau khi xoa LPB" + mapCk);

        mapCk.replace("stocks", "VND,SSI,MBS,FTS");
        System.out.println("Danh sach sau khi thay the: "+ mapCk);


    }
}