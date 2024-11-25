import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    private final static int ONE_HOUR = 60;
    private final static int ONE_DAY = 24;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        int cookTime = scanner.nextInt();

        scanner.close();

        M = M + cookTime;

        while (M >= ONE_HOUR) {
            H = H + 1;
            M = M - ONE_HOUR;

            if (H > 23) {
                H = H - ONE_DAY;
            }
        }
        out.println(H + " " + M);
    }
}