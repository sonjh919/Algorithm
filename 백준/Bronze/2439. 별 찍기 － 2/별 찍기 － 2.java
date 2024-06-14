import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
        static int T;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            T = Integer.parseInt(br.readLine());

            for(int i=0;i<T;i++){
                for(int j=T-1;j>i;j--){
                    bw.write(" ");
                }
                for(int k=0;k<=i;k++){
                    bw.write("*");
                }
                bw.write("\n");
            }

            bw.flush();
            bw.close();
            br.close();
        }
}
