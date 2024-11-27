import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        scanner.close();

        for (int i = 1; i < 10; i++) {
            int multiple = N * i;

            out.println(N + " * " + i + " = " + multiple);
        }
    }
}