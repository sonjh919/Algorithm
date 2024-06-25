import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

//        count = (N/15)*3;
//        N %= 15;

        while(N>0) {
            if (N % 5 == 0) {
                count += N / 5;
                break;
            }
            else {
                count++;
                N -= 3;
            }
            if(N<0){
                count = -1;
            }
        }
        bw.write(String.valueOf(count));

        //then
        bw.flush();
        bw.close();
        br.close();
    }



}
