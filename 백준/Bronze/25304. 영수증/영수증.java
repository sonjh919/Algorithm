import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

        static int n;
        static int sum = 0;
        static int T;


        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st;
            n = Integer.parseInt(br.readLine());
            T = Integer.parseInt(br.readLine());

            for(int i=0;i<T;i++){
                st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                sum += A * B;
            }

            if(n == sum)
                bw.write("Yes");
            else
                bw.write("No");

            bw.flush();
            bw.close();
            br.close();
        }
}
