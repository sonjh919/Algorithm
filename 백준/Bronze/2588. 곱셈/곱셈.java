import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int A;
    static int B;
    static String s;

    static int sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());

        s = B + "";
        for(int i=s.length()-1;i>=0;i--){
            bw.write(A*(s.charAt(i)-'0')+"\n");
        }

        bw.write(A*B + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
