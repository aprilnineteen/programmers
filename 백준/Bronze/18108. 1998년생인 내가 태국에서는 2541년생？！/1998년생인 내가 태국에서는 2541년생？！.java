import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int ERA_GAP = 543;

    public static void main(String[] args) {
        int buddhistEra = scanner.nextInt();

        scanner.close();

        System.out.print(buddhistEra - ERA_GAP);
    }
}