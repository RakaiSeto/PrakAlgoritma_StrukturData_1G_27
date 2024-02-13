package P1;

public class fungsi {
    public static void main(String[] args) {
        int[] harga = {75000, 50000, 60000, 10000};
        int[][] stock = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
        
        pendapatanCabang(stock, harga);
        stockBaru(stock, 1, 2, 0, 5);
    }

    static void pendapatanCabang(int[][] data, int[] harga) {
        int i = 1;
        System.out.println("================================================");
        for (int[] cabang : data) {
            System.out.print("Cabang " + i + ": ");
            int pendapatanCabang = (int) (cabang[0] * harga[0] + cabang[1] * harga[1] + cabang[2] * harga[2] + cabang[3] * harga[3]);
            System.out.print(pendapatanCabang);
            System.out.println();
            i++;
        }
    }

    static void stockBaru(int[][] data, int aglonema, int keladi, int alocasia, int mawar) {
        System.out.println("================================================");
        System.out.println("stock aglonema: " + (data[3][0] - aglonema));
        System.out.println("stock keladi: " + (data[3][1] - keladi));
        System.out.println("stock alocasia: " + (data[3][2] - alocasia));
        System.out.println("stock mawar: " + (data[3][3] - mawar));
    }
}
