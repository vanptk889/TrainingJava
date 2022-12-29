package thuypham.mangMotChieu;

public class InViTri {

    public static void main(String[] args) {
        String danhSachMa[] = new String[]{"VND", "BSR", "TCB", "TPB", "MBB", "MBS", "SSI", "HPG"};
        String ma = "MBB";
        int size = danhSachMa.length;
        for (int i = 0; i < size; i++) {
            if (danhSachMa[i] == ma) {
                System.out.println("Mã MBB nằm ở vị trí thứ " + (i + 1));
            }

        }

    }
}
