import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int A, B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb;
        StringTokenizer st = new StringTokenizer(br.readLine());

        sb = new StringBuilder(st.nextToken());
        A= Integer.parseInt(sb.reverse().toString());

        sb = new StringBuilder(st.nextToken());
        B= Integer.parseInt(sb.reverse().toString());

        bw.write(String.valueOf(Math.max(A, B)));

        bw.flush();
        bw.close();
        br.close();
    }
}
