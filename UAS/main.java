package UAS;

import Kuis2.Pembeli_26;

import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        DoubleLinkedList kendaraanList = new DoubleLinkedList();
        DoubleLinkedList bayarPajakList = new DoubleLinkedList();

        System.out.println("=========================================");
        System.out.println("              UAS TI-1G 2024             ");
        System.out.println("            RAKAI SETO SEMBODO           ");
        System.out.println("                2341720135               ");
        System.out.println("=========================================");

        Data data1 = new Data();
        data1.kendaraan = new Kendaraan("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4);
        kendaraanList.addLast(data1);
        Data data2 = new Data();
        data2.kendaraan = new Kendaraan("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3);
        kendaraanList.addLast(data2);
        Data data3 = new Data();
        data3.kendaraan = new Kendaraan("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2);
        kendaraanList.addLast(data3);
        Data data4 = new Data();
        data4.kendaraan = new Kendaraan("B 1234 AG", "Sisa", "Motor", 150, 2020, 1);
        kendaraanList.addLast(data4);

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi Berdasarkan nama");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu (1-5): ");
            int menu = sc27.nextInt();
            sc27.nextLine();

            switch (menu) {
                case 1:
                    kendaraanList.printKendaraan();
                    break;
                case 2:
                    System.out.println("-------------------------------------------");
                    System.out.println("Masukkan Data Pembayaran");
                    System.out.println("-------------------------------------------");
                    System.out.print("Masukkan Nomer TNKB: ");
                    String noTNKB = sc27.nextLine();
                    System.out.print("Bulan Bayar: ");
                    int bulanBayar = sc27.nextInt();
                    if (kendaraanList.searchKendaraan(noTNKB)) {
                        long basePrice = 0;
                        int denda = 0;
                        Kendaraan theKendaraan = kendaraanList.getKendaraan(noTNKB);
                        if (Objects.equals(theKendaraan.jenis, "Motor")) {
                            if (theKendaraan.cc < 100) {
                                basePrice = 100000;
                            } else if (theKendaraan.cc <= 250) {
                                basePrice = 250000;
                            } else {
                                basePrice = 500000;
                            }
                        } else {
                            if (theKendaraan.cc < 1000) {
                                basePrice = 750000;
                            } else if (theKendaraan.cc <= 2500) {
                                basePrice = 1000000;
                            } else {
                                basePrice = 1500000;
                            }
                        }
                        if (bulanBayar > theKendaraan.bulanHarusBayar) {
                            if (bulanBayar - theKendaraan.bulanHarusBayar > 3) {
                                denda = (bulanBayar - theKendaraan.bulanHarusBayar) * 50000;
                            } else {
                                denda = 50000;
                            }
                        }

                        System.out.println("|kode\t\t|TNKB\t\t|Nama\t\t|Nominal\t\t|Denda");
                        System.out.printf("|%d\t\t\t|%s\t|%s\t\t|%d\t\t|%d\n", bayarPajakList.size + 1, theKendaraan.noTNKB, theKendaraan.nama, basePrice, denda);
                        Data dataBayar = new Data();
                        dataBayar.transaksiPajak = new TransaksiPajak(bayarPajakList.size + 1, bulanBayar, basePrice, denda, theKendaraan);
                        bayarPajakList.addFirst(dataBayar);
                    } else {
                        System.out.println("Kendaraan tidak ditemukan");
                    }
                    break;
                case 3:
                    bayarPajakList.printBayar();
                    break;
                case 4:
                    DoubleLinkedList temp = bayarPajakList;
                    temp.urutkanNama();
                    temp.printBayar();
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        }
    }
}
