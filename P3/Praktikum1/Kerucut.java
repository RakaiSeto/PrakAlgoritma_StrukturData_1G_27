package P3.Praktikum1;

public class Kerucut {
    public double jariJari;
    public double sisimiring;

    public Kerucut(double r, double t) {
        jariJari = r;
        sisimiring = t;
    }

    public double hitungVolume() {
//        cari tinggi kerucut, lalu hitung
        double tinggi = Math.sqrt((sisimiring * sisimiring) - (jariJari * jariJari));
        return (Math.PI * jariJari * jariJari * tinggi) / 3;
    }

    public double hitungLuasPermukaan() {
        return Math.PI * jariJari * (jariJari + sisimiring);
    }
}
