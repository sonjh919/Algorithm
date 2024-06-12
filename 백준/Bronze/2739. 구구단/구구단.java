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

            for(int i=1;i<=9;i++){
                bw.write(A + " * " + i + " = " + A*i + "\n");
            }

            bw.flush();
            bw.close();
            br.close();
        }
    }
