import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

        static int n;
        static int sum = 0;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            n = Integer.parseInt(br.readLine());
            for(int i=1;i<=n;i++)
                sum += i;

            bw.write(String.valueOf(sum));
            bw.flush();
            bw.close();
            br.close();
        }
}
