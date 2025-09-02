import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
시간제한 2초: 최대 계산 횟수는 2억번

N (1 ≤ N ≤ 100,000)
M (1 ≤ M ≤ N)

O(N*M) 안됨, O(NlogM) 가능
*/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 블루레이 크기가 제일 극단적인 두 값
        int start=0; // 블루레이 크기가 제일 작은 경우 -> 블루레이 N개에 담는 경우 -> 제일 큰 레슨 값
        int end=0; // 블루레이 크기가 제일 큰 경우 -> 블루레이 1개에 담는 경우 -> 모든 레슨의 길이를 더함

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(start<arr[i]) start = arr[i];
            end += arr[i];
        }
        
        while(start <= end){
            int middle = (start+end)/2;
            int sum = 0;
            int count = 0;

            // middle 블루레이 크기로 모두 저장할 수 있는지 확인
            for(int i=0;i<N;i++){
                if(sum + arr[i] > middle){
                    count++;
                    sum = 0;
                }
                sum+=arr[i];
            }

            if(sum!=0)count++; // 끝에 하나 남아있을 경우
            if(count>M){ // 블루레이 개수가 더 많을 경우: 개수를 줄여야 함 -> 블루레이 크기를 늘려야 함 (오른쪽 선택)
                start = middle+1;
            }
            else{ // 블루레이 개수가 더 작을 경우: 개수를 늘려야 함 -> 블루레이 크기를 줄여야 함 (왼쪽 선택)
                end = middle-1;
            }
        }

        bw.write(start+"");

        // close
        bw.flush();
        bw.close();
        br.close();
    }
}
