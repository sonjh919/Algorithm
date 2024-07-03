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
        int N, count;

        boolean[] prime = new boolean[1000000];
        for (int i = 0; i < prime.length; i++) {
            if(isPrime(i))prime[i]=true;
        }

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());

            count = 0;
            for (int j = 2; j <= N/2; j++) {
                if(prime[j] && prime[N-j]){
                    count++;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isPrime(int num) {
        if(num<2)return false;
        if(num==2)return true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i==0)return false;
        }
        return true;
    }

}
