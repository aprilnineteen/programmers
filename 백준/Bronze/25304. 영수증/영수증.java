import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    private static final int EXPECTED_BALANCE = 0;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAmount = scanner.nextInt();

        int itemTypes = scanner.nextInt();

        for (int i = 0; i < itemTypes; i++) {
            int item = scanner.nextInt();
            int amount = scanner.nextInt();

            totalAmount -= item * amount;
        }

        scanner.close();

        if (totalAmount == EXPECTED_BALANCE) {
            out.print(YES);
        } else out.print(NO);
    }
}