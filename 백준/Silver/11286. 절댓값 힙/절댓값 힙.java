import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
시간제한 2초: 최대 계산 횟수는 2억번

1 <= N <= 100,000

시간 복잡도 : O(N) 가능, O(N^2) 불가능
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(
                Comparator.comparingInt((Integer x) -> Math.abs(x))
                        .thenComparingInt(x -> x)
        );
        
        int input;
        for (int i = 0; i < n; i++) {
            input = Integer.parseInt(br.readLine());

            if(input==0){
                if(queue.isEmpty()){
                    bw.write("0\n");
                }
                else bw.write(queue.poll()+"\n");
            }
            else {
                queue.add(input);
            }
        }

        // close
        bw.flush();
        bw.close();
        br.close();
    }
}
