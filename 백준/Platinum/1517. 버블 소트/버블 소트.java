import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
시간제한 1초: 최대 계산 횟수는 1억번

N <= 500,000

시간 복잡도 : O(NlogN) 까지 가능, O(N^2) 불가능 -> 병합 정렬 사용!
*/
public class Main {

    public static int[] arr, tmp;
    public static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        int n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        tmp = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        result = 0;

        merge_sort(1,n);

        bw.write(result+"");

        // close
        bw.flush();
        bw.close();
        br.close();
    }

    private static void merge_sort(int start, int end) {
        if (end - start < 1) return;
        int middle = start + (end-start)/2;

        merge_sort(start,middle);
        merge_sort(middle+1,end);

        for(int i = start;i<=end;i++){
            tmp[i] = arr[i];
        }

        int k=start;
        int index1 = start;
        int index2 = middle + 1;

        while(index1 <= middle && index2 <= end){
            if(tmp[index1] > tmp[index2]){
                arr[k] = tmp[index2];
                result = result + index2 - k;
                k++;
                index2++;
            }
            else{
                arr[k] = tmp[index1];
                k++;
                index1++;
            }
        }

        while(index1 <= middle){
            arr[k] = tmp[index1];
            k++;
            index1++;
        }
        while(index2 <= end){
            arr[k] = tmp[index2];
            k++;
            index2++;
        }
    }
}


