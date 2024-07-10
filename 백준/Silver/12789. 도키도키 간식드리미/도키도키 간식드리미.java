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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num, count = 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(st.nextToken());
            if(num==count)count++;
            else stack.push(num);

            while(true){
                if(!stack.empty() && count==stack.peek()){
                    stack.pop();
                    count++;
                }
                else break;
            }
        }

        int size = stack.size();
        for (int i = 0; i <= size; i++) {
            if(!stack.empty() && count==stack.peek()){
                stack.pop();
                count++;
            }
        }
        if(stack.isEmpty())bw.write("Nice");
        else bw.write("Sad");

        bw.flush();
        bw.close();
        br.close();
    }

}
