import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    private static final int MIN = 1;
    private static final int MAX = 10000;

    public static void main(String[] args) {
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        scanner.close();

        if (A >= MIN && B <= MAX) {
            System.out.println(A + B);
            System.out.println(A - B);
            System.out.println(A * B);
            System.out.println(A / B);
            System.out.println(A % B);
        }
    }
}