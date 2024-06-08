package P13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMahasiswa {
    List<Mahasiswa> mhs = new ArrayList<>();

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m1 = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m2 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m3 = new Mahasiswa("201236", "Shannum", "021xx3");
        lm.tambah(m1, m2, m3);
        lm.tampil();
        lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
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

    int linearSearch(String nim) {
        for (int i = 0; i < mhs.size(); i++) {
            if (mhs.get(i).nim.equals(nim)) {
                return i;
            }
        }
        return -1;
    }
}
