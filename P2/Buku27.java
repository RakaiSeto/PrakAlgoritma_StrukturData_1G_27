package P2;

public class Buku27 {
    String judul, pengarang;
    int halaman, stok, harga, terjual;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp. " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            terjual += jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hargalain) {
        harga = hargalain;
    }

    int hitungHargaTotal() {
        return terjual * stok;
    }

    int hitungDiskon() {
        if(harga > 150000 ) {
            return 12 * harga / 100;
        } else if (harga < 75000) {
            return 0;
        } else {
            return 5 * harga / 100;
        }
    }

    int hitungHargaBayar() {
        return harga - hitungDiskon();
    }

    public Buku27() {

    }

    public Buku27(String jud, String pen, int hal, int stok, int har) {
        judul = jud;
        pengarang = pen;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}
