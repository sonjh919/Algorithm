import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int c = gcd(a,b);
        
        bw.write(c + "\n" + a*b/c);
        br.close();
        bw.close();
    }

    private static int gcd(int a, int b) {
        while(b!=0){
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }

}
