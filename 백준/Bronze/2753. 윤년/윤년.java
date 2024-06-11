import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

        static int A;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            A = Integer.parseInt(br.readLine());

            if(A%4==0 && A%100!=0 || A%400==0)
                bw.write("1");
            else
                bw.write("0");


            bw.flush();
            bw.close();
            br.close();
        }
    }
