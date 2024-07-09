import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int tmp;
        StringTokenizer st;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            tmp = Integer.parseInt(st.nextToken());
            if(tmp==1){
                stack.push(Integer.parseInt(st.nextToken()));
            }
            else if(tmp==2){
                if(stack.empty()) bw.write(-1 + "\n");
                else bw.write(stack.pop()+"\n");
            }
            else if(tmp==3){
                bw.write(stack.size()+"\n");
            }
            else if(tmp==4){
                if(stack.empty()) bw.write(1 + "\n");
                else bw.write(0+"\n");
            }
            else if(tmp==5){
                if(stack.empty()) bw.write(-1+"\n");
                else bw.write(stack.peek()+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
