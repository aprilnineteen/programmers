import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String [] arr = a.split("");

        for (String s : arr) {
            System.out.println(s);
        }
    }
}