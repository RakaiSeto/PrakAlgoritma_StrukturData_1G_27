package P6;

public class Buku {
    int kodeBuku, tahunTerbit, stock;
    String judulBuku, pengarang;

    public Buku(int k, int t, int s, String j, String p) {
        kodeBuku = k;
        tahunTerbit = t;
        stock = s;
        judulBuku = j;
        pengarang = p;
    }

    public void tampilDataBuku() {
        System.out.println("==================================");
        System.out.println("Kode Buku: " + kodeBuku);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Stock: " + stock);
        System.out.println("Judul Buku: " + judulBuku);
        System.out.println("Pengarang: " + pengarang);
    }


}
