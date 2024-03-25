package P4;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc26.nextInt();

        Pangkat[] pk = new Pangkat[iJml];
        for (int i = 0; i < iJml; i++) {
            pk[i] = new Pangkat();
            System.out.println("Masukkan nilai elemen ke-" + (i+1) + ": ");
            pk[i].nilai = sc26.nextInt();
            System.out.println("Masukkan pangkat elemen ke-" + (i+1) + ": ");
            pk[i].pangkat = sc26.nextInt();
        }

        System.out.println("Hasil Pangkat dengan Brute Force");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Pangkat dari " + pk[i].nilai + " pangkat " + pk[i].pangkat + " adalah: " + pk[i].hitungPangkatBF());
        }
        System.out.println("Hasil Pangkat dengan Divide and Conquer");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Pangkat dari " + pk[i].nilai + " pangkat " + pk[i].pangkat + " adalah: " + pk[i].hitungPangkatDC(pk[i].nilai, pk[i].pangkat));
        }
    }
}
