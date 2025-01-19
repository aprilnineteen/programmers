import java.io.*;

class Main {
    private static final String star = "*";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            bw.write(star.repeat(i + 1));
            bw.flush();
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}