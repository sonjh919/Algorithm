import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
        static int A;
        static int B;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st;
            String str;

            while( (str=br.readLine()) != null ){

                st = new StringTokenizer(str," ");
                A = Integer.parseInt(st.nextToken());
                B = Integer.parseInt(st.nextToken());
                bw.write(String.valueOf(A + B)+ "\n");
            }

            bw.flush();
            bw.close();
            br.close();
        }
}
