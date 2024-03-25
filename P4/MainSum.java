package P4;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);

        System.out.println("Program menghitung jumlah keuntungan total");
        System.out.println("Masukkan jumlah company: ");

        int elm = sc26.nextInt();

        Sum[] company = new Sum[elm];

        for (int i = 0; i < elm; i++) {
            int elm2 = sc26.nextInt();
            company[i] = new Sum(elm);

            for (int j = 0; j < elm2; j++) {
                System.out.println("Masukkan keuntungan ke-" + (i + 1) + ": ");
                company[i].keuntungan[i] = sc26.nextInt();
            }

            System.out.println("Total keuntungan perusahaan selama " + elm + " bulan adalah: " + company[i].totalBF(company[i].keuntungan));
            System.out.println("Total keuntungan perusahaan selama " + elm + " bulan adalah: " + company[i].totalDC(company[i].keuntungan, 0, elm - 1));
        }
    }
}
