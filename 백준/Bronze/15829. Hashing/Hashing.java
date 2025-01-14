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

        int L = Integer.parseInt(br.readLine());
        String s = br.readLine();
        BigInteger res = new BigInteger("0");

        for (int i = 0; i < L; i++) {
            res = res.add(BigInteger.valueOf(s.charAt(i)-96).multiply(BigInteger.valueOf(31).pow(i)));
        }

        bw.write(res.remainder(BigInteger.valueOf(1234567891)) + "\n");

        br.close();
        bw.close();
    }
}
