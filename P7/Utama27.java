package P7;

import java.util.Scanner;

public class Utama27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        Gudang27 gudang27 = new Gudang27(7);

        while (true) {
            System.out.println("===== Menu =====");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.println("================");
            System.out.print("Pilihan Menu: ");
            int pilihan27 = sc27.nextInt();
            sc27.nextLine();

            switch (pilihan27) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode27 = sc27.nextInt();
                    sc27.nextLine();

                    System.out.print("Masukkan nama barang: ");
                    String nama27 = sc27.nextLine();

                    System.out.print("Masukkan kategori barang: ");
                    String kategori27 = sc27.nextLine();

                    Barang27 barang27 = new Barang27(kode27, nama27, kategori27);
                    gudang27.tambahBarang(barang27);
                    break;
                case 2:
                    gudang27.ambilBarang();
                    break;
                case 3:
                    gudang27.tampilkanBarang();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}
