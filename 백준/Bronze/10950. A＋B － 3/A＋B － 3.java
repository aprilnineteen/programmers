import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        while (count-- > 0) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            out.println(A + B);
        }
        scanner.close();
    }
}