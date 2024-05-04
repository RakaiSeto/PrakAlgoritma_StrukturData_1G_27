package P8.Praktikum2;

import java.util.Scanner;

public class QueueMain26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);
        int pilih = 0;
        System.out.print("Masukkan kapasitas antrian: ");
        int jumlah = sc26.nextInt();
        Queue26 antri = new Queue26(jumlah);

        do {
            menu();
            pilih = sc26.nextInt();
            sc26.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan norek: ");
                    String norek = sc26.nextLine();
                    System.out.println("Nama: ");
                    String nama = sc26.nextLine();
                    System.out.println("Alamat: ");
                    String alamat = sc26.nextLine();
                    System.out.println("Umur: ");
                    int umur = sc26.nextInt();
                    System.out.println("Saldo: ");
                    double saldo = sc26.nextDouble();

                    Nasabah26 nb = new Nasabah26(norek, nama, alamat, umur, saldo);
                    sc26.nextLine();
                    antri.enqueue(nb);
                    break;
                case 2:
                    Nasabah26 dataKeluar = antri.dequeue();
                    if(!"".equals(dataKeluar.norek) && !"".equals(dataKeluar.nama) && !"".equals(dataKeluar.alamat) && dataKeluar.umur != 0 && dataKeluar.saldo != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar.norek + " " + dataKeluar.nama + " " + dataKeluar.alamat + " " + dataKeluar.saldo);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }

    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("------------------");
    }
}
