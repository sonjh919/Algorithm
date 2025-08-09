import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
시간제한 2초: 최대 계산 횟수는 2억번

M <= 10,000,000
N <= 15,000

O(M) 가능, O(M^2) 불가능
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // two pointer
        Arrays.sort(arr);

        int start = 0;
        int end = N-1;
        int count = 0;

        int sum;
        while(start < end){
            sum = arr[start]+arr[end];
            if(sum==M){
                count++;
                start++;
            }
            else if(sum < M){
                start++;
            }
            else end--;
        }

        bw.write(count+"");

        // close
        bw.flush();
        br.close();
        bw.close();
    }
}
