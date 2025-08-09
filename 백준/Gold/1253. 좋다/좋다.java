import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
시간제한 2초: 최대 계산 횟수는 2억번

Ai <= 1,000,000,000
N <= 2,000

O(N^2)까지 가능
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        final int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) { // O(N)
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // two pointer
        Arrays.sort(arr); // O(NlogN)

        int start;
        int end;
        int count = 0;
        int sum;

        // 두 수 계산에서 자신 포함하면 안됨.
        for (int i = 0; i < N; i++) { // O(N)
            start = 0;
            end = N-1;

            while(start < end){ // O(N)

                if(start==i){
                    start++;
                    continue;
                }
                if(end==i){
                    end--;
                    continue;
                }

                sum = arr[start] + arr[end];
                if(sum==arr[i]){
                    count++;
                    break;
                }
                else if (sum > arr[i])end--;
                else start++;
            }
        }

        bw.write(count+"");

        // close
        bw.flush();
        br.close();
        bw.close();
    }
}
