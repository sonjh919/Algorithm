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

        int T = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");

            switch(input[0]){
                case "push":
                    queue.addLast(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    if(queue.isEmpty()){bw.write("-1\n");}
                    else bw.write(queue.removeFirst() + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if(queue.isEmpty()){bw.write("1\n");}
                    else bw.write("0\n");
                    break;
                case "front":
                    if(queue.isEmpty()){bw.write("-1\n"); }
                    else bw.write(queue.getFirst() + "\n");
                    break;
                case "back":
                    if(queue.isEmpty()){bw.write("-1\n"); }
                    else bw.write(queue.getLast() + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
