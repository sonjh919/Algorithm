import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            int sum = sum(K,N);
            bw.write(sum + "\n");
        }
        
        br.close();
        bw.close();
    }

    private static int sum(int k, int n) {
        int sum = 0;
        if(k==0){
            return n;
        }
        for (int i = 1; i <= n; i++) {
            sum += sum(k-1, i);
        }
        return sum;
    }
    
}
