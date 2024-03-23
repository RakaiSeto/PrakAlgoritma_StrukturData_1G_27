package P4;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc26.nextInt();

        Faktorial[] fk = new Faktorial[iJml];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai elemen ke-" + (i+1) + ": ");
            fk[i].nilai = sc26.nextInt();
        }

        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Faktorial dari " + fk[i].nilai + " adalah: " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Faktorial dari " + fk[i].nilai + " adalah: " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
