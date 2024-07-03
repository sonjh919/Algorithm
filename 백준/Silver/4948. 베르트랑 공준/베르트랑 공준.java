import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, count;
        while(true){
            N = Integer.parseInt(br.readLine());
            if(N==0)break;

            count = 0;
            for (int i = N+1; i <= 2*N; i++) {
                if(isPrime(i))count++;
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
