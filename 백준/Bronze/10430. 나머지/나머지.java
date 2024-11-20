import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    private static final Scanner scanner = new Scanner(in);

    public static void main(String[] args) {
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        scanner.close();

        out.println((A + B) % C);
        out.println(((A % C) + (B % C)) % C);
        out.println((A * B) % C);
        out.println(((A % C) * (B % C)) % C);
    }
}