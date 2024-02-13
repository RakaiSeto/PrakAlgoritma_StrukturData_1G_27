package P1;

import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan n : ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                if (i != 6 && i != 10) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
            }
        }   
    }
}
