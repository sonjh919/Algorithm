import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
        static int N;
        static int V;
        static int sum = 0;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            V = Integer.parseInt(br.readLine());

            for(int i=0;i<N;i++){
                if(Integer.parseInt(st.nextToken())==V){
                    sum++;
                }
            }


            bw.write(String.valueOf(sum));

            bw.flush();
            bw.close();
            br.close();
        }
}
