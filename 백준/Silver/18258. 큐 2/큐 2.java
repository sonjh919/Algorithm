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
        Integer tmp;

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()){
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    tmp = queue.poll();
                    if(tmp==null) bw.write(-1+"\n");
                    else  bw.write(tmp+"\n");
                    break;
                case "size":
                    bw.write(queue.size()+"\n");
                    break;
                case "empty":
                    if(queue.isEmpty()) bw.write(1+"\n");
                    else bw.write(0+"\n");
                    break;
                case "front":
                    tmp = queue.peek();
                    if(tmp==null)bw.write(-1+"\n");
                    else  bw.write(tmp+"\n");
                    break;
                case "back":
                    tmp = queue.peekLast();
                    if(tmp==null)bw.write(-1+"\n");
                    else  bw.write(tmp+"\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
