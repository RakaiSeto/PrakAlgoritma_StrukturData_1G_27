package P6;

public class PencarianBuku {
    Buku listBuku[] = new Buku[5];
    int idx;

    public Buku findBuku(int cari) {
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].kodeBuku == cari) {
                return listBuku[i];
            }
        }
        return null;
    }

    void tambah(Buku b) {
        if (idx < listBuku.length) {
            listBuku[idx] = b;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku b : listBuku) {
            b.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].kodeBuku == cari) {
                return i;
            }
        }
        return -1;
    }

    public void TampilPosisi(int x, int pos) {
        if (pos != 1) {
            System.out.println("data : " + x + " ditemukan pada posisi : " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks ke-" + pos);
            System.out.println("Kode buku : " + x);
            System.out.println("Judul : " + listBuku[pos].judulBuku);
            System.out.println("Tahun Terbit : " + listBuku[pos].tahunTerbit);
            System.out.println("Pengarang : " + listBuku[pos].pengarang);
            System.out.println("Stock : " + listBuku[pos].stock);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
}
