import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String SURPRISE_MESSAGE = "??!";

    public static void main(String[] args) {
        String duplicateId = scanner.nextLine();

        scanner.close();

        System.out.println(duplicateId + SURPRISE_MESSAGE);
    }
}