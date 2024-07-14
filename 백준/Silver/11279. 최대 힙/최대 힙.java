import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        int N = Integer.parseInt(br.readLine());
        int x;
        for (int i = 0; i < N; i++) {
            x = Integer.parseInt(br.readLine());
            if(x==0){
                bw.write(priorityQueue.isEmpty()?"0\n":priorityQueue.poll() + "\n");
            }
            else{
                priorityQueue.add(x);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
