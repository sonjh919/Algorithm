import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int H = Integer.parseInt(input[0]);
            int W = Integer.parseInt(input[1]);
            int N = Integer.parseInt(input[2]);

            int unit = 1;
            int num = 1;

            while(N>0){
                if(N>H) {
                    N -= H;
                    num++;
                }
                else if (N==H){
                    N -= H;
                    unit = H;
                }
                else{
                    unit = N;
                    N -= H;
                }
            }

            System.out.println(unit * 100 + num);
        }

        bw.flush();
        bw.close();
        br.close();

    }
}

