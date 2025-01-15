import java.io.*;
import java.text.MessageFormat;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] numbers = br.readLine().split(" ");
            int A = Integer.parseInt(numbers[0]);
            int B = Integer.parseInt(numbers[1]);
            bw.write(MessageFormat.format("Case #{0}: {1}", i + 1, A + B));
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }
}