package P7;

public class Gudang27 {
    Barang27 listBarang[];
    int size, top;

    public Gudang27(int size) {
        this.size = size;
        listBarang = new Barang27[size];
        top = -1;
    }

    boolean cekKosong() {
        return this.top == -1;
    }

    boolean cekPenuh() {
        return this.top == this.size - 1;
    }

    void tambahBarang(Barang27 b) {
        if (!cekPenuh()) {
            this.listBarang[++top] = b;
            System.out.println("Barang " + b.nama + " berhasil ditambahkan ke gudang!");
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    Barang27 ambilBarang() {
        if (!cekKosong()) {
            System.out.println("Barang " + listBarang[top].nama + " berhasil diambil dari gudang!");
            Barang27 delete = listBarang[top];
            top--;
            return delete;
        } else {
            System.out.println("Data kosong!");
            return null;
        }
    }

    Barang27 lihatBarangTeratas() {
        if (!cekKosong()) {
            System.out.println("Barang teratas: " + listBarang[top].nama);
            return this.listBarang[top];
        } else {
            System.out.println("Data kosong!");
            return null;
        }
    }

    void tampilkanBarang() {
        if (!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                System.out.println("Kode: " + listBarang[i].kode);
                System.out.println("Nama: " + listBarang[i].nama);
                System.out.println("Kategori: " + listBarang[i].kategori);
                System.out.println("================");
            }
        } else {
            System.out.println("Data kosong!");
        }
    }
}
