import java.util.Scanner;

class Main {
    private static final String LONG_INT = "long int";
    private static final String LONG = "long ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(LONG.repeat(N / 4 - 1) + LONG_INT);
    }
}