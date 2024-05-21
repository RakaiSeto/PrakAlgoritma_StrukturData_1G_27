package Kuis2;

import java.util.Random;
import java.util.Scanner;

public class Main_26 {
    public static void main(String[] args) {
        String[] Names26 = {"Firman", "Budi", "Yulia", "Joko", "Zul", "Nina", "Dewi", "Rizky", "Eka", "Agus", "Wawan", "Hendra", "Utami", "Lestari", "Oscar"};
        String[] Phone26 = {"081891559140", "081216549506", "087491178861", "083817658913", "081111859084", "083685749205", "084018308510", "085128466864", "084462823240", "080759746152", "088467000593", "086512387238", "088152204238", "085677000312", "087533186482"};
        Random random26 = new Random();
        Scanner scRakai = new Scanner(System.in);
        LinkedList_26 listAntrian26 = new LinkedList_26();
        LinkedList_26 listPesanan26 = new LinkedList_26();

        System.out.println("====== QUIZ 2 PRAKTIKUM ASD TI ======");
        System.out.println("Dibuat Oleh : Rakai Seto Sembodo");
        System.out.println("NIM : 2341720135");
        System.out.println("Absen : 26");
        System.out.println("=====================================");
        System.out.println("Sistem antrian resto");

        boolean keluar26 = false;
        int nomorAntrian = 0;
        do {
            int pilihan26;
            System.out.println("=================================");
            System.out.println("Menu");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan pesanan by nama");
            System.out.println("5. Hitung total pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih(1-5): ");
            pilihan26 = scRakai.nextInt();
            scRakai.nextLine();

            switch (pilihan26) {
                case 1:
                    nomorAntrian++;
                    int index26 = random26.nextInt(Names26.length);
                    Pembeli_26 pembeli26 = new Pembeli_26(Names26[index26], Phone26[index26]);
                    System.out.println("Nama Customer: " + pembeli26.NamaPembeli_26);
                    System.out.println("No Hp: " + pembeli26.NoHp_26);
                    Data_26 temp26 = new Data_26(nomorAntrian, pembeli26, null);
                    System.out.println("Nomor Antrian: " + nomorAntrian);
                    listAntrian26.addLastPembeli(temp26);
                    break;
                case 2:
                    listAntrian26.printAntrian();
                    break;
                case 3:
                    Node_26 antrian = listAntrian26.removeFirst();
                    System.out.println(antrian.data_26.pembeli.NamaPembeli_26 + " telah memesan makanan");
                    System.out.println("---------------------------------");
                    System.out.println("Transaksi input pesanan");
                    System.out.println("---------------------------------");
                    System.out.println("Nomor pesanan: " + antrian.data_26.urutan);
                    System.out.print("Pesanan : ");
                    String pesanan26 = scRakai.nextLine();
                    System.out.println("Harga : ");
                    int harga26 = scRakai.nextInt();
                    scRakai.nextLine();
                    Pesanan_26 thePesanan26 = new Pesanan_26(antrian.data_26.urutan, pesanan26, harga26);
                    Data_26 temp = new Data_26(antrian.data_26.urutan, antrian.data_26.pembeli, thePesanan26);
                    listPesanan26.addLastPesanan(temp);
                    break;
                case 4:
                    LinkedList_26 tempPesanan = listPesanan26;
                    tempPesanan.sort();
                    tempPesanan.printPesanan();
                    break;
                case 5:
                    if (listAntrian26.size != 0) {
                        System.out.println("Masih ada antrian yang belum dilayani");
                    } else {
                        listPesanan26.hitungTotal();
                    }
                    break;
                case 6:
                    System.out.println("Terima Kasih");
                    keluar26 = true;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (!keluar26);
    }
}
