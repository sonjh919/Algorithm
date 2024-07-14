import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) == Math.abs(o2))
                    return o1 - o2;
                else
                    return Math.abs(o1) - Math.abs(o2);
            }
        });

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
