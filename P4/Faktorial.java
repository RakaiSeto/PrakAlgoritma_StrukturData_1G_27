package P4;

public class Faktorial {
    int nilai;

    int faktorialBF(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    int faktorialDC(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorialDC(n - 1);
        }
    }
}
