package P8;

import java.util.Scanner;

public class QueueMain {
    static Scanner sc26 = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Masukkan jumlah maksimal antrian: ");
        int n = sc26.nextInt();
        Queue26 q26 = new Queue26(n);

        int pilih = 0;

        do {
            menu();
            pilih = sc26.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan data baru: ");
                    int dataMasuk = sc26.nextInt();
                    q26.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = q26.dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3:
                    q26.print();
                    break;
                case 4:
                    q26.peek();
                    break;
                case 5:
                    q26.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);

    }

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("------------------");
    }
}
