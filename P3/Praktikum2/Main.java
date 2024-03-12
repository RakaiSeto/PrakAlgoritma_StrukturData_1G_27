package P3.Praktikum2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rakai26 = new Scanner(System.in);

        Mahasiswa[] mhsArray = new Mahasiswa[3];

        for (int i = 0; i < mhsArray.length; i++) {
            mhsArray[i] = new Mahasiswa(i, "", "", i);
            System.out.println("Mahasiswa ke-" + i);
            System.out.print("Masukkan Nama: ");
            mhsArray[i].nama = rakai26.next();
            System.out.print("Masukkan Jenis Kelamin: ");
            mhsArray[i].jenisKelamin = rakai26.next();
            System.out.print("Masukkan NIM: ");
            mhsArray[i].nim = rakai26.nextInt();
            System.out.print("Masukkan IPK: ");
            mhsArray[i].ipk = rakai26.nextDouble();
        }

        System.out.println();

//        tampilkan data mahasiswa dengan foreach
        for (Mahasiswa mahasiswa : mhsArray) {
            System.out.println("Nama: " + mahasiswa.nama + ", Jenis Kelamin: " + mahasiswa.jenisKelamin + ", NIM: " + mahasiswa.nim + ", IPK: " + mahasiswa.ipk);
        }

        System.out.println("Rata-rata IPK: " + Mahasiswa.hitungRataRataIpk(mhsArray));
        Mahasiswa.detailIpkTerbesar(mhsArray);
    }
}
