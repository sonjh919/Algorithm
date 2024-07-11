import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch(Integer.parseInt(st.nextToken())){
                case 1:
                    queue.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    queue.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if(queue.isEmpty()) bw.write(-1+"\n");
                    else  bw.write(queue.removeFirst()+"\n");
                    break;
                case 4:
                    if(queue.isEmpty()) bw.write(-1+"\n");
                    else  bw.write(queue.removeLast()+"\n");
                    break;
                case 5:
                    bw.write(queue.size()+"\n");
                    break;
                case 6:
                    if(queue.isEmpty()) bw.write(1+"\n");
                    else bw.write(0+"\n");
                    break;
                case 7:
                    if(queue.isEmpty())bw.write(-1+"\n");
                    else  bw.write(queue.peekFirst()+"\n");
                    break;
                case 8:
                    if(queue.isEmpty())bw.write(-1+"\n");
                    else  bw.write(queue.peekLast()+"\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
