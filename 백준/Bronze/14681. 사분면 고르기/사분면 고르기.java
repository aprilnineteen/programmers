import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        scanner.close();

        out.print(QuadrantCalculator(A, B));
    }

    public static int QuadrantCalculator(int A, int B) {
        if (A > 0 && B > 0) {
            return 1;
        }

        if (A < 0 && B > 0) {
            return 2;
        }

        if (A < 0 && B < 0) {
            return 3;
        }

        if (A > 0 && B < 0) {
            return 4;
        }
        return 0;
    }
}