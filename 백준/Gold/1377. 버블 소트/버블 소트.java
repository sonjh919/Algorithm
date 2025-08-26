import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

/*
시간제한 2초: 최대 계산 횟수는 2억번

N <= 500,000

시간 복잡도 : O(NlogN) 까지 가능, O(N^2) 불가능
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input
        int n = Integer.parseInt(br.readLine());
        Data[] arr = new Data[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Data(i, Integer.parseInt(br.readLine()));
        }

        // 버블 정렬
        /*
         핵심 : 버블 정렬에서 한바퀴 돌면 무조건 맨 끝은 제일 큰 수로 정렬됨!!
         오른쪽에서 왼쪽으로는 한번에 한번씩밖에 못감
         -> 오른쪽에서 왼쪽으로 간 인덱스가 제일 많은 곳 찾기!!
         */
        Arrays.sort(arr, Comparator.comparing(data -> data.value));

        int[] answer = new int[n];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].index - i;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < answer.length; i++) {
            max = Math.max(max, answer[i]);
        }

        bw.write(max+1+"");

        // close
        bw.flush();
        bw.close();
        br.close();
    }

    static class Data{
        int index;
        int value;

        public Data(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}


