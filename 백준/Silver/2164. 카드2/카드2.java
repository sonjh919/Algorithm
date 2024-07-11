import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = N; i >= 1; i--) {
            queue.add(i);
        }

        while(queue.size()>1){
            queue.removeLast();
            queue.addFirst(queue.removeLast());
        }

        bw.write(String.valueOf(queue.peek()));


        bw.flush();
        bw.close();
        br.close();
    }

}
