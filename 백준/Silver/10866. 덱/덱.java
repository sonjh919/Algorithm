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
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");

            switch(input[0]){
                case "push_front":
                    stack.addFirst(Integer.parseInt(input[1]));
                    break;
                case "push_back":
                    stack.addLast(Integer.parseInt(input[1]));
                    break;
                case "pop_front":
                    if(stack.isEmpty()){bw.write("-1\n");}
                    else bw.write(stack.removeFirst() + "\n");
                    break;
                case "pop_back":
                    if(stack.isEmpty()){bw.write("-1\n"); }
                    else bw.write(stack.removeLast() + "\n");
                    break;
                case "size":
                    bw.write(stack.size() + "\n");
                    break;
                case "empty":
                    if(stack.isEmpty()){bw.write("1\n");}
                    else bw.write("0\n");
                    break;
                case "front":
                    if(stack.isEmpty()){bw.write("-1\n"); }
                    else bw.write(stack.getFirst() + "\n");
                    break;
                case "back":
                    if(stack.isEmpty()){bw.write("-1\n"); }
                    else bw.write(stack.getLast() + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
