import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
시간제한 1초: 최대 계산 횟수는 1억번

D (3 ≤ D ≤ 30)
K (10 ≤ K ≤ 100,000)

O(K), O(KlogK) 가능.
*/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        int []num = new int[9];
        int sum = 0;
        
        for(int i=0;i<9;i++){
            num[i] = Integer.parseInt(br.readLine());
            sum += num[i];
        }

        for(int i=0;i<8;i++){
            for(int j=i+1;j<9;j++){
                if(sum - (num[i] + num[j]) == 100){
                    num[i] = 0;
                    num[j] = 0;
                    Arrays.sort(num);
                    for(int k=2;k<9;k++){
                        System.out.println(num[k]);
                    }
                    return;
                }
            }
        }

        // close
        bw.flush();
        bw.close();
        br.close();
    }
}
