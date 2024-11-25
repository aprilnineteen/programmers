import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    private final static int ALERT_TIME = 45;
    private final static int ONE_HOUR = 60;
    private final static int ONE_DAY = 24;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt() - ALERT_TIME;

        scanner.close();

        if (M < 0) {
            H = H - 1;
            M = ONE_HOUR + M;
        }

        if(H < 0){
            H = ONE_DAY + H;
        }

        out.println(H + " " + M);
    }
}