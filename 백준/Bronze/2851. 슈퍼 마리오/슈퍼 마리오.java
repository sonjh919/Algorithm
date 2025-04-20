import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.parseInt(br.readLine());
        int sum=max;
        for (int i = 1; i < 10; i++) {
            int score = Integer.parseInt(br.readLine());
            sum += score;
            if(Math.abs(100-max) >= Math.abs(100-sum)){
                max = sum;
            }
        }

        bw.write(max+"");

        br.close();
        bw.close();
    }

}
