import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        long S = Long.parseLong(br.readLine());

        int n = 1;
        int count = 0;
        while(S >= 0){
            S -= n++;
            count++;
        }

        bw.write(count-1+"");

        // output
        br.close();
        bw.close();
    }

}
