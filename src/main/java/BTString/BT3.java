package BTString;

public class BT3 {
    public static void main(String[] args) {
        BT3 bt3 = new BT3();
        String s = "hoc java     co ban den nang " + "      \n cao";
        s = s.replaceAll("\\s\\s", "");
        System.out.println(s.trim());
        int countWord = 0;
        String[] strArr = s.split("\\s", 0);
        for (String strArr1 : strArr) {
            if (!strArr1.isEmpty())
                countWord++;
        }
        System.out.println("Số từ của chuỗi đã cho là: "
                + countWord);

    }
}
