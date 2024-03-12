package P3.Praktikum1;

public class Bola {
    public double jariJari;

    public Bola(double r) {
        jariJari = r;
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double hitungVolume() {
        return (4 * Math.PI * jariJari * jariJari * jariJari) / 3;
    }
}
