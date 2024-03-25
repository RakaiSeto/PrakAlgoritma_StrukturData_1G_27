package P4;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc26.nextInt();

        Pangkat[] pk = new Pangkat[iJml];
        for (int i = 0; i < iJml; i++) {
            System.out.println("Masukkan nilai elemen ke-" + (i+1) + ": ");
            int nilai = sc26.nextInt();
            System.out.println("Masukkan pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = sc26.nextInt();
            pk[i] = new Pangkat(nilai, pangkat);
        }

        boolean isTrue = false;
        while (!isTrue) {
//            get menu
            System.out.println("Pilih menu: ");
            System.out.println("1. Hitung Pangkat dengan Brute Force");
            System.out.println("2. Hitung Pangkat dengan Divide and Conquer");
            System.out.println("3. Keluar");
            int menu = sc26.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Hasil Pangkat dengan Brute Force");
                    for (int i = 0; i < iJml; i++) {
                        System.out.println("Pangkat dari " + pk[i].nilai + " pangkat " + pk[i].pangkat + " adalah: " + pk[i].hitungPangkatBF());
                    }
                    isTrue = true;
                    break;
                case 2:
                    System.out.println("Hasil Pangkat dengan Divide and Conquer");
                    for (int i = 0; i < iJml; i++) {
                        System.out.println("Pangkat dari " + pk[i].nilai + " pangkat " + pk[i].pangkat + " adalah: " + pk[i].hitungPangkatDC(pk[i].nilai, pk[i].pangkat));
                    }
                    isTrue = true;
                    break;
                case 3:
                    isTrue = true;
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        }
    }
}
