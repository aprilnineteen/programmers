import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    private static final Scanner scanner = new Scanner(in);

    public static void main(String[] args) {
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();

        scanner.close();

        out.println(A + B + C);
    }
}