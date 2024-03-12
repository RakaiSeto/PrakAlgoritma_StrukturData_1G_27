package P3.ArrayObjects;

import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        Scanner rakai26 = new Scanner(System.in);

//        ganti dengan menerima input menggunakan for loop untuk panjang dan lebar
        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = rakai26.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = rakai26.nextInt();
        }

//        tampilkan masing2 lebar dan panjang menggunakan for loop
        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + i + ", panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}
