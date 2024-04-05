package P6;

import java.util.Scanner;

public class BukuMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku data = new PencarianBuku();
        int jumBuku = 5;

        System.out.println("==================================");
        System.out.println("Masukkan Data Buku secara urut dari KodeBuku terkecil");

        for (int i = 0; i < jumBuku; i++) {
            System.out.println("----------------------------------");
            System.out.println("Buku ke-" + (i + 1));
            System.out.print("Kode Buku: ");
            int kode = s.nextInt();
            System.out.print("Judul Buku: ");
            String judul = s1.nextLine();
            System.out.print("Tahun Terbit: ");
            int tahun = s.nextInt();
            System.out.print("Pengarang: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock: ");
            int stock = s.nextInt();

            Buku b = new Buku(kode, tahun, stock, judul, pengarang);
            data.tambah(b);
        }

        System.out.println("----------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("___________________________________");
        System.out.println("___________________________________");
        System.out.println("Pencarian Data Buku");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.println("Kode Buku");
        int cari = s.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
