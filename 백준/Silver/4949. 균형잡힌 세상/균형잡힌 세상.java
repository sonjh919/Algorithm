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

        String S;
        while(true){
            S = br.readLine();
            if(S.equals("."))break;

            if(isVPS(S))bw.write("yes" + "\n");
            else bw.write("no" + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isVPS(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if('(' == c | '[' == c) stack.push(c);
            else if(c==')'){
                if(stack.empty() || stack.peek() != '(')return false;
                else stack.pop();
            }
            else if(c==']'){
                if(stack.empty() || stack.peek() != '[')return false;
                else stack.pop();
            }
        }
        return stack.empty();
    }

}
