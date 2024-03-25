package P4;

public class Pangkat {
    public int nilai;
    public int pangkat;

    public int hitungPangkatBF() {
        int hasil = 1;
        for (int i = 1; i <= pangkat; i++) {
            hasil *= nilai;
        }
        return hasil;
    }

    public int hitungPangkatDC(int n, int p) {
        if (p == 0) {
            return 1;
        } else {
            return n * hitungPangkatDC(n, p - 1);
        }
    }
}
