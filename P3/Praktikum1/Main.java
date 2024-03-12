package P3.Praktikum1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rakai26 = new Scanner(System.in);

        Kerucut[] kArray = new Kerucut[2];
        Limas[] lArray = new Limas[2];
        Bola[] bArray = new Bola[2];

//        for loop untuk membuat objek sesuai panjang masing masing array
        for (int i = 0; i < kArray.length; i++) {
            kArray[i] = new Kerucut(i, i);
            System.out.println("Kerucut ke-" + i);
            System.out.print("Masukkan jari-jari: ");
            kArray[i].jariJari = rakai26.nextInt();
            System.out.print("Masukkan sisi miring: ");
            kArray[i].sisimiring = rakai26.nextInt();
        }

        for (int i = 0; i < lArray.length; i++) {
            lArray[i] = new Limas(i, i);
            System.out.println("Limas ke-" + i);
            System.out.print("Masukkan sisi: ");
            lArray[i].sisi = rakai26.nextInt();
            System.out.print("Masukkan tinggi: ");
            lArray[i].tinggi = rakai26.nextInt();
        }

        for (int i = 0; i < bArray.length; i++) {
            bArray[i] = new Bola(i);
            System.out.println("Bola ke-" + i);
            System.out.print("Masukkan jari-jari: ");
            bArray[i].jariJari = rakai26.nextInt();
        }

//        for loop untuk menampilkan volume dan luas permukaan masing-masing objek
        for (int i = 0; i < kArray.length; i++) {
            System.out.println("Kerucut ke-" + i + ", volume: " + kArray[i].hitungVolume() + ", luas permukaan: " + kArray[i].hitungLuasPermukaan());
        }

        for (int i = 0; i < lArray.length; i++) {
            System.out.println("Limas ke-" + i + ", volume: " + lArray[i].hitungVolume() + ", luas permukaan: " + lArray[i].hitungLuasPermukaan());
        }

        for (int i = 0; i < bArray.length; i++) {
            System.out.println("Bola ke-" + i + ", volume: " + bArray[i].hitungVolume() + ", luas permukaan: " + bArray[i].hitungLuasPermukaan());
        }

    }
}
