import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int N;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        //when
        for (int i = 1; i <= N; i++) {
            sb.append(" ".repeat(N - i));
            sb.append("*".repeat(2*i - 1));
            sb.append("\n");
        }
        
        for (int i = 1; i < N; i++) {
            sb.append(" ".repeat(i));
            sb.append("*".repeat(2*(N-i) - 1));
            sb.append("\n");
        }
        
        bw.write(sb.toString());

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
