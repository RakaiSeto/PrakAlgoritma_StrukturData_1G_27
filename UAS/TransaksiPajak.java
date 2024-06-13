package UAS;

public class TransaksiPajak {
    int kode, bulanBayar;
    long nominalBayar, denda;
    Kendaraan kendaraan;

    public TransaksiPajak(int kode, int bulanBayar, long nominalBayar, long denda, Kendaraan kendaraan) {
        this.kode = kode;
        this.bulanBayar = bulanBayar;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.kendaraan = kendaraan;
    }
}
