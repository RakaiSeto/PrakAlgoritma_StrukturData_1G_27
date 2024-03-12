package P3.Praktikum2;

public class Mahasiswa {
    public long nim;
    public String nama;
    public String jenisKelamin;
    public double ipk;

    Mahasiswa(long n, String nm, String jk, double i) {
        nim = n;
        nama = nm;
        jenisKelamin = jk;
        ipk = i;
    }

    //fungsi untuk menampilkan rata2 ipk array mahasiswa
    public static double hitungRataRataIpk(Mahasiswa[] mhsArray) {
        double totalIpk = 0;
        for (Mahasiswa mahasiswa : mhsArray) {
            totalIpk += mahasiswa.ipk;
        }
        return totalIpk / mhsArray.length;
    }

    //    fungsi untuk menampilkan ipk terbesar array mahasiswa dan return objek mahasiswa
    public static Mahasiswa ipkTerbesar(Mahasiswa[] mhsArray) {
        Mahasiswa mhs = mhsArray[0];
        for (Mahasiswa mahasiswa : mhsArray) {
            if (mahasiswa.ipk > mhs.ipk) {
                mhs = mahasiswa;
            }
        }
        return mhs;
    }

    //    fungsi untuk menampilkan detail dari mahasiswa dengan ipk terbesar
    public static void detailIpkTerbesar(Mahasiswa[] mhsArray) {
        Mahasiswa mhs = ipkTerbesar(mhsArray);
        System.out.println("Mahasiswa dengan IPK terbesar adalah " + mhs.nama + " dengan NIM " + mhs.nim + " dan IPK " + mhs.ipk);
    }
}
