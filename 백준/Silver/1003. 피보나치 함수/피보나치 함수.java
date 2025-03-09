import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static int[] db0 = new int[41];
    static int[] db1 = new int[41];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        db0[0] = 1;
        db1[0] = 0;
        db0[1] = 0;
        db1[1] = 1;

        for(int i=2;i<=40;i++){
            db0[i] = db0[i-1] + db0[i-2];
            db1[i] = db1[i-1] + db1[i-2];
        }

        // input
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(db0[n] + " " + db1[n] + "\n");
        }

//      output
        br.close();
        bw.close();
    }
}
