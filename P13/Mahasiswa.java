package P13;

public class Mahasiswa {
    String nim, nama, notelp;

    public Mahasiswa(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    public Mahasiswa() {

    }

    @Override
    public String toString() {
        return String.format("%s %s %s", nim, nama, notelp);
    }
}
