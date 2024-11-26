import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDice = scanner.nextInt();
        int secondDice = scanner.nextInt();
        int thirdDice = scanner.nextInt();

        scanner.close();

        int result = 0;

        if (firstDice == secondDice && firstDice == thirdDice) {
            result = 10000 + (firstDice * 1000);
        } else if (firstDice == secondDice || firstDice == thirdDice) {
            result = 1000 + (firstDice * 100);
        } else if (secondDice == thirdDice) {
            result = 1000 + (secondDice * 100);
        } else {
            result = Math.max(firstDice, Math.max(secondDice, thirdDice)) * 100;
        }

        out.print(result);
    }
}