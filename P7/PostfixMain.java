package P7;

import java.util.Scanner;

public class PostfixMain {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc27.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix27 postfix27 = new Postfix27(total);
        P = postfix27.konversi(Q);
        System.out.println("Postfix : " + P);

    }
}

