package P13;

import java.util.*;

public class ListMahasiswa {
    List<Mahasiswa> mhs = new ArrayList<>();

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m1 = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m2 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m3 = new Mahasiswa("201236", "Shannum", "021xx3");
        lm.tambah(m1, m2, m3);
        lm.tampil();
        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }

    public void tambah(Mahasiswa... mahasiswas) {
        mhs.addAll(Arrays.asList(mahasiswas));
    }

    public void hapus(int idx) {
        mhs.remove(idx);
    }

    public void update(int idx, Mahasiswa m) {
        mhs.set(idx, m);
    }

    public void tampil() {
        mhs.stream().forEach(e -> {
            System.out.println("" + e.toString());
        });
    }

    int binarySearch(String nim) {
        // Urutkan list berdasarkan field 'nim'
        Collections.sort(mhs, Comparator.comparing(m -> m.nim));

        // Buat objek Mahasiswa dengan 'nim' yang dicari
        Mahasiswa searchKey = new Mahasiswa(nim, null, null);

        // Gunakan binarySearch untuk mencari 'nim' dalam list
        int index = Collections.binarySearch(mhs, searchKey, Comparator.comparing(m -> m.nim));

        // Jika 'nim' ditemukan, kembalikan indeksnya. Jika tidak, kembalikan -1
        return (index >= 0) ? index : -1;
    }
}
