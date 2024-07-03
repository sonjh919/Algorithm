import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < T; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        BigInteger gcd = BigInteger.valueOf(0);
        for (int i = 1; i < list.size(); i++) {
            int distance = list.get(i)-list.get(i-1);
            gcd = gcd.gcd(BigInteger.valueOf(distance));
        }
        
        int size = list.size();
        int count = ((list.get(size - 1) - list.get(0)) / gcd.intValue())+1 - size;
        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
        br.close();
    }

}
