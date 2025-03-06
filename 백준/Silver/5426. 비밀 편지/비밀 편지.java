import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        // input
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            s = br.readLine();
            int len = (int) Math.sqrt(s.length());

            for (int i = len-1; i >=0; i--){
                for(int j=0;j<len*len;j += len){
                    bw.write(s.charAt(i+j));
                }
            }
            bw.write("\n");
        }

//      output
        br.close();
        bw.close();
    }
}
