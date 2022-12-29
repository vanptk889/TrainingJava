package thuypham.mangMotChieu;

public class InViTriDungHam {
    String danhSachMa[] = new String[]{"VND", "BSR", "TCB", "TPB", "MBB", "MBS", "SSI", "HPG"};
    String ma = "MBB";
    int size = danhSachMa.length;
    static int i = 0;

    public static void main(String[] args) {
        InViTriDungHam inViTriDungHam = new InViTriDungHam();
        inViTriDungHam.inViTriDoWhile();
        inViTriDungHam.inViTriWhile();
        inViTriDungHam.inViTriFor();

    }

    public void inViTriDoWhile() {
        InViTriDungHam inViTriDungHam = new InViTriDungHam();

        do {
            if (inViTriDungHam.danhSachMa[inViTriDungHam.i] == inViTriDungHam.ma) {
                System.out.println("Mã MBB DoWhile nằm ở vị trí thứ " + (i + 1));
            }
            inViTriDungHam.i++;
        } while (inViTriDungHam.i < inViTriDungHam.size);

    }

    public void inViTriWhile() {
        InViTriDungHam inViTriDungHam = new InViTriDungHam();
        while (inViTriDungHam.i < inViTriDungHam.size) {
            if (inViTriDungHam.danhSachMa[inViTriDungHam.i] == inViTriDungHam.ma) {
                System.out.println("Mã MBB While nằm ở vị trí thứ " + (i + 1));
            }
            inViTriDungHam.i = inViTriDungHam.i++;
        }

    }

    public void inViTriFor() {
        InViTriDungHam inViTriDungHam = new InViTriDungHam();
        for (inViTriDungHam.i = 0; inViTriDungHam.i < inViTriDungHam.size; inViTriDungHam.i++) {
            if (inViTriDungHam.danhSachMa[inViTriDungHam.i] == inViTriDungHam.ma) {
                System.out.println("Mã MBB For nằm ở vị trí thứ " + (i + 1));
            }

        }

    }

}