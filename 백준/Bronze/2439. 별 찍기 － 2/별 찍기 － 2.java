import java.io.*;
import java.text.MessageFormat;

class Main {
    private static final String STAR = "*";
    private static final String EMPTY = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            bw.write(EMPTY.repeat(N-i)+STAR.repeat(i));
            bw.flush();
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}