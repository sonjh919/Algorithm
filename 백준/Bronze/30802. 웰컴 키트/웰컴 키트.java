import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] S = br.readLine().split(" ");
        String[] bundle = br.readLine().split(" ");

        int T = Integer.parseInt(bundle[0]);
        int P = Integer.parseInt(bundle[1]);

        int T_num = 0;
        int P_bundle_num = 0;
        int P_num = 0;
        for (String s : S) {
            T_num += Integer.parseInt(s) / T;
            if (Integer.parseInt(s) % T > 0) {
                T_num++;
            }
        }

        P_bundle_num = N / P;
        P_num = N % P;

        bw.write(T_num + "\n");
        bw.write(P_bundle_num + " " + P_num);
        br.close();
        bw.close();
    }
}
