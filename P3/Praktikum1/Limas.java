package P3.Praktikum1;

public class Limas {
    public double sisi;
    public double tinggi;

    public Limas(double p, double t) {
        sisi = p;
        tinggi = t;
    }

    public double hitungVolume() {
        return (sisi * sisi * tinggi) / 3;
    }

    public double hitungLuasPermukaan() {
        return (sisi * sisi) + (4 * (sisi * tinggi) / 2);
    }
}
