package P1;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int perhitunganAtas = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        System.out.print("Masukkan nilai angka untuk MK Pancasila : ");
        int Pancasila = scanner.nextInt();
        System.out.print("Masukkan nilai angka untuk MK KTI : ");
        int KTI = scanner.nextInt();
        System.out.print("Masukkan nilai angka untuk MK CTPS : ");
        int CTPS = scanner.nextInt();
        System.out.print("Masukkan nilai angka untuk MK MatDas : ");
        int MatDas = scanner.nextInt();
        System.out.print("Masukkan nilai angka untuk MK BIng : ");
        int BIng = scanner.nextInt();
        System.out.print("Masukkan nilai angka untuk MK Daspro : ");
        int Daspro = scanner.nextInt();
        System.out.print("Masukkan nilai angka untuk MK PrakDaspro : ");
        int PrakDaspro = scanner.nextInt();
        System.out.print("Masukkan nilai angka untuk MK K3 : ");
        int K3 = scanner.nextInt();

        perhitunganAtas += getBobot(Pancasila) * 2;
        perhitunganAtas += getBobot(KTI) * 2;
        perhitunganAtas += getBobot(CTPS) * 2;
        perhitunganAtas += getBobot(BIng) * 2;
        perhitunganAtas += getBobot(Daspro) * 2;
        perhitunganAtas += getBobot(K3) * 2;
        perhitunganAtas += getBobot(PrakDaspro) * 3;
        perhitunganAtas += getBobot(MatDas) * 3;

        double ip = perhitunganAtas / 18;
        
        System.out.println("================================");
        System.out.println("Hasil konversi nilai");
        System.out.println("================================");
        System.out.println("Pancasila \t" + getHuruf(Pancasila) + "\t" + getBobot(Pancasila));
        System.out.println("KTI \t\t" + getHuruf(KTI) + "\t" + getBobot(KTI));
        System.out.println("CTPS \t\t" + getHuruf(CTPS) + "\t" + getBobot(CTPS));
        System.out.println("BIng \t\t" + getHuruf(BIng) + "\t" + getBobot(BIng));
        System.out.println("Daspro \t\t" + getHuruf(Daspro) + "\t" + getBobot(Daspro));
        System.out.println("K3 \t\t" + getHuruf(K3) + "\t" + getBobot(K3));
        System.out.println("PrakDaspro \t" + getHuruf(PrakDaspro) + "\t" + getBobot(PrakDaspro));
        System.out.println("MatDas \t\t" + getHuruf(MatDas) + "\t" + getBobot(MatDas));
        System.out.println("================================");
        System.out.println("IP : " + ip);
        System.out.println("================================");
    }

    static String getHuruf(int nilai) {
        String huruf;

        if (nilai > 80) {
            huruf = "A";
        } else if (nilai > 73) {
            huruf = "B+";
        } else if (nilai > 65) {
            huruf = "B";
        } else if (nilai > 60) {
            huruf = "C+";
        } else if (nilai > 50) {
            huruf = "C";
        } else if (nilai > 39) {
            huruf = "D";
        } else {
            huruf = "E";
        }

        return huruf;
    }

    static double getBobot(int nilai) {
        double huruf;

        if (nilai > 80) {
            huruf = 4.00;
        } else if (nilai > 73) {
            huruf = 3.50;
        } else if (nilai > 65) {
            huruf = 3.00;
        } else if (nilai > 60) {
            huruf = 2.50;
        } else if (nilai > 50) {
            huruf = 2.00;
        } else if (nilai > 39) {
            huruf = 1.00;
        } else {
            huruf = 0.00;
        }

        return huruf;
    }
}
