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

        // input
        String str = br.readLine();
        String[] s = str.split(" ");
        BigInteger n = new BigInteger(s[0]);
        BigInteger m = new BigInteger(s[1]);

        // output
        bw.write(n.divide(m) + "\n" + n.remainder(m));
        br.close();
        bw.close();
    }
}
