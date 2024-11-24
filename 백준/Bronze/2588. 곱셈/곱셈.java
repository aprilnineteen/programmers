import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    private static final Scanner scanner = new Scanner(in);

    public static void main(String[] args) {
        int A = scanner.nextInt();
        String B = scanner.next();

        scanner.close();

        out.println(A * (B.charAt(2) - '0'));
        out.println(A * (B.charAt(1) - '0'));
        out.println(A * (B.charAt(0) - '0'));
        out.println(A * Integer.parseInt(B));
    }
}