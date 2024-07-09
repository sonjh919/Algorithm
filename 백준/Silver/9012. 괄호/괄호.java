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

        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            if(isVPS(S))bw.write("YES" + "\n");
            else bw.write("NO" + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isVPS(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if('(' == s.charAt(i)) stack.push('(');
            else{
                if(stack.empty())return false;
                else stack.pop();
            }
        }
        return stack.empty();
    }

}
