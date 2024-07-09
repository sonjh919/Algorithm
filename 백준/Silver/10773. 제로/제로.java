import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int num, sum=0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(br.readLine());
            if(num==0) stack.pop();
            else stack.push(num);
        }

        for (Integer i : stack) {
            sum += i;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }

}
