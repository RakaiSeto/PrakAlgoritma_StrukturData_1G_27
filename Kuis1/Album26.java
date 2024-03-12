package Kuis1;

import java.util.Scanner;

public class Album26 {
    String judul26;
    String penyanyi26;
    int jumlah26;
    int harga26;

    public static void main(String[] args) {
        Album26[] album = new Album26[5];
        Scanner sc26 = new Scanner(System.in);

        for (int i = 0; i < album.length; i++) {
            // get input for each attribute, then make a new object
            System.out.println("Album ke-" + (i + 1));
            System.out.print("Judul Album : ");
            String judul26 = sc26.nextLine();
            System.out.print("Penyanyi : ");
            String penyanyi26 = sc26.nextLine();
            System.out.print("Jumlah : ");
            int jumlah26 = sc26.nextInt();
            System.out.print("Harga : ");
            int harga26 = sc26.nextInt();
            System.out.println("=====================================");
            sc26.nextLine();
            album[i] = new Album26(judul26, penyanyi26, jumlah26, harga26);
        }

        System.out.println("=====================================");
        
        for (Album26 album26 : album) {
            album26.tampil();
            System.out.println("-------------------------------------");
        }

        System.out.println("=====================================");

        for (Album26 album26 : album) {
            System.out.println("Total Penjualan : " + album26.judul26 + ": " + album26.hitungPenjualan());
        }

        System.out.println("=====================================");

        cariAlbumTerlaris(album);
        
        System.out.println("=====================================");

        daftarAlbum(album);

        sc26.close();
    }

    public Album26() {

    }

    public Album26(String judul26, String penyanyi26, int jumlah26, int harga26) {
        this.judul26 = judul26;
        this.penyanyi26 = penyanyi26;
        this.jumlah26 = jumlah26;
        this.harga26 = harga26;
    }

    void tampil() {
        System.out.println("Judul Album : " + judul26);
        System.out.println("Penyanyi : " + penyanyi26);
        System.out.println("Jumlah : " + jumlah26);
        System.out.println("Harga : " + harga26);
    }

    int hitungPenjualan() {
        return this.jumlah26 * this.harga26;
    }

    static void cariAlbumTerlaris(Album26[] album) {
        int max26 = 0;
        int index26 = 0;
        for (int i = 0; i < album.length; i++) {
            if (album[i].jumlah26 > max26) {
                max26 = album[i].jumlah26;
                index26 = i;
            }
        }
        System.out.println("Album Terlaris : " + album[index26].judul26);
    }

    static void daftarAlbum(Album26[] album) {
        // order the album by alphabet ascending, store it in a temporary storage, then display the ordered album
        Album26 temp26;
        for (int i = 0; i < album.length; i++) {
            for (int j = i + 1; j < album.length; j++) {
                if (album[i].judul26.compareTo(album[j].judul26) > 0) {
                    temp26 = album[i];
                    album[i] = album[j];
                    album[j] = temp26;
                }
            }
        }
        for (Album26 album26 : album) {
            System.out.println(album26.judul26);
        }
        
    }
}
