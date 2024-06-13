import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

        static int n;


        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            n = Integer.parseInt(br.readLine());
            n /= 4;

            for(int i=0;i<n;i++){
                bw.write("long ");
            }
            bw.write("int");

            bw.flush();
            bw.close();
            br.close();
        }
}
