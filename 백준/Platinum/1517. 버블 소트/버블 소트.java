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
    public static long result; // N<= 500,000일 때, 최대 스왑 횟수는 NC2이므로 int 범위 초과 -> long!!

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
        if (end - start < 1) return; // start==end, 즉 원소가 하나일 때 리턴
        int middle = start + (end-start)/2; // 가운데 세팅

        merge_sort(start,middle); // 분할 Divide
        merge_sort(middle+1,end);

        for(int i = start;i<=end;i++){ // 임시 배열 할당
            tmp[i] = arr[i];
        }

        // 정복 Conquer
        int current_index = start; // 정렬되는 인덱스는 start부터 시작
        int index1_pointer = start; // 투포인터1 : 앞쪽 배열 시작점
        int index2_pointer = middle + 1; // 투포인터2 : 뒤쪽 배열 시작점

        while(index1_pointer <= middle && index2_pointer <= end){ // 두 배열 중 어느 한 쪽이 끝에 갈 때까지
            if(tmp[index1_pointer] > tmp[index2_pointer]){ // 앞쪽 배열이 뒤쪽 배열보다 크다면
                arr[current_index] = tmp[index2_pointer]; // 뒤쪽 배열의 포인터가 가리키는 값을 arr에 정렬
                result = result + index2_pointer - current_index; // 인덱스 이동만큼 result에 더해주기!!(==swap 횟수!)
                current_index++;
                index2_pointer++;
            }
            else{ // 앞쪽 배열이 뒤쪽 배열보다 작다면
                arr[current_index] = tmp[index1_pointer]; // 앞쪽 배열의 포인터가 가리키는 값을 arr에 정렬
                current_index++;
                index1_pointer++;
            }
        }

        while(index1_pointer <= middle){ // 뒤쪽 배열 정렬이 끝났을 경우 앞쪽 배열은 이미 정리되어 있는 것. 그대로 추가해주기.
            arr[current_index] = tmp[index1_pointer];
            current_index++;
            index1_pointer++;
        }
        while(index2_pointer <= end){ // 마찬가지로, 뒤쪽 배열 그대로 추가해주기.
            arr[current_index] = tmp[index2_pointer];
            current_index++;
            index2_pointer++;
        }
    }
}


