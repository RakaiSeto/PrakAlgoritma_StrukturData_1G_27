package P1;

import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        int tugas, kuis, uts, uas;

        Scanner scanner = new Scanner(System.in);
        println("PROGRAM MENGHITUNG NILAI SISWA");
        println("================================================");
        print("Masukkan nilai tugas (0-100) : ");
        tugas = scanner.nextInt();
        print("Masukkan nilai kuis (0-100) : ");
        kuis = scanner.nextInt();
        print("Masukkan nilai UTS (0-100) : ");
        uts = scanner.nextInt();
        print("Masukkan nilai UAS (0-100) : ");
        uas = scanner.nextInt();
        println("================================================");

        if (tugas < 0 || tugas > 100) {
            println("Nilai tidak valid");
            println("Nilai tugas harus di antara 0 - 100");
            println("================================================");
        }
        if (kuis < 0 || kuis > 100) {
            println("Nilai tidak valid");
            println("Nilai kuis harus di antara 0 - 100");
            println("================================================");
        }
        if (uts < 0 || uts > 100) {
            println("Nilai tidak valid");
            println("Nilai uts harus di antara 0 - 100");
            println("================================================");
        }
        if (uas < 0 || uas > 100) {
            println("Nilai tidak valid");
            println("Nilai uas harus di antara 0 - 100");
            println("================================================");
        }

        double nilaiAkhir = (0.1 * tugas + 0.2 * kuis + 0.3 * uts + 0.4 * uas);

        println("================================================");
        println("nilai akhir : " + nilaiAkhir);
        String huruf;

        if (nilaiAkhir > 80) {
            huruf = "A";
        } else if (nilaiAkhir > 73) {
            huruf = "B+";
        } else if (nilaiAkhir > 65) {
            huruf = "B";
        } else if (nilaiAkhir > 60) {
            huruf = "C+";
        } else if (nilaiAkhir > 50) {
            huruf = "C";
        } else if (nilaiAkhir > 39) {
            huruf = "D";
        } else {
            huruf = "E";
        }

        println("nilai huruf : " + huruf);
        println("================================================");

        if (huruf.equals("D") || huruf.equals("E")) {
            println("ANDA TIDAK LULUS");
        } else {
            println("SELAMAT ANDA LULUS");
        }

    }

    static void println(String arg) {
        System.out.println(arg);
    } 
    static void print(String arg) {
        System.out.print(arg);
    } 
}
