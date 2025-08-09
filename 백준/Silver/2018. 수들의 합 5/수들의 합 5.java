import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
시간제한 2초: 최대 계산 횟수는 2억번

N <= 10,000,000

O(N) 가능, O(N^2) 불가능
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // N input
        int N = Integer.parseInt(br.readLine());

        // two pointer
        int start = 1;
        int end = 1;
        int sum = 1;
        int count = 0;

        while(end<=N){
            if(sum==N){
                count++;
                sum += ++end;
            }
            else if(sum > N){
                sum -= start++;
            }
            else{
                sum += ++end;
            }
        }

        bw.write(count+"");

        // close
        bw.flush();
        br.close();
        bw.close();
    }
}

