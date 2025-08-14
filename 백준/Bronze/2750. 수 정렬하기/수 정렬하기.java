import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
시간제한 1초: 최대 계산 횟수는 1억번

N <= 1,000

시간 복잡도 : O(N^2) 까지 가능
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int temp;
        for (int i = 0; i < n; i++) {
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(Integer i : arr){
            bw.write(i+"\n");
        }
        // close
        bw.flush();
        bw.close();
        br.close();
    }
}
