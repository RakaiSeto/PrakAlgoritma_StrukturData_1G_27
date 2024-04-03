package P5;

public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    public Mahasiswa(String n, int thn, int u, double i) {
        nama = n;
        thnMasuk = thn;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + thnMasuk);
        System.out.println("Umur: " + umur);
        System.out.println("IPK: " + ipk);
    }
}
