import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
        static int N, X;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            X = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            for(int i=0;i<N;i++){
                int temp = Integer.parseInt(st.nextToken());
                if(temp<X){
                    bw.write(temp + " ");
                }
            }

            bw.flush();
            bw.close();
            br.close();
        }
}
