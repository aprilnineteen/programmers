import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();

       out.print(gradeCalculator(score));
    }

    public static char gradeCalculator(int score) {
        if (score >= 90 && score <= 100) {return 'A';}
        if (score >= 80 && score < 90) {return 'B';}
        if (score >= 70 && score < 80) {return 'C';}
        if (score >= 60 && score < 70) {return 'D';}
        else return 'F';
    }
}