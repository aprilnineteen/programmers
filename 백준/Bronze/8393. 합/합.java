import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = 0;

        scanner.close();

        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        out.print(sum);
    }
}