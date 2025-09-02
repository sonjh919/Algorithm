import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
시간제한 1초: 최대 계산 횟수는 1억번
 N(1 ≤ N ≤ 100,000)
 M(1 ≤ M ≤ 100,000)
O(N) 가능, O(NlogN), O(NlogM) 가능, O(N*M) 불가능
*/
public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            bw.write(search(Integer.parseInt(st.nextToken()))+"\n");
        }

        // close
        bw.flush();
        bw.close();
        br.close();
    }

    static int search(int num){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int middle = (start+end)/2;
            if(num==arr[middle])return 1;
            else if(num<arr[middle]){
                end = middle-1;
            }
            else{
                start = middle+1;
            }
        }
        return 0;
    }

}
