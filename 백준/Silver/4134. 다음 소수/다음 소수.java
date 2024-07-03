import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        BigInteger num;
        for (int i = 0; i < T; i++) {
            num = new BigInteger(br.readLine());
            if(num.isProbablePrime(10)) bw.write(num + "\n");
            else bw.write(num.nextProbablePrime()+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
