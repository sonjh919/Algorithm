import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

        static int A;
        static int B;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            A = Integer.parseInt(br.readLine());
            B = Integer.parseInt(br.readLine());

            if(A>0 && B>0)
                bw.write("1");
            else if(A<0 && B>0)
                bw.write("2");
            else if(A<0 && B<0)
                bw.write("3");
            else
                bw.write("4");

            bw.flush();
            bw.close();
            br.close();
        }
    }
