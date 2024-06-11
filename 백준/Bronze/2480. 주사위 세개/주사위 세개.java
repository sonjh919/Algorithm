import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

        static int A;
        static int B;
        static int C;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());

            if(A==B && B==C)
                bw.write(String.valueOf(10000+A*1000));
            else if(A==B || A==C || B==C)
                bw.write(String.valueOf(1000+(A==B?A:C)*100));
            else
                bw.write(String.valueOf(Math.max(Math.max(A,B),C)*100));
            
            bw.flush();
            bw.close();
            br.close();
        }
    }
