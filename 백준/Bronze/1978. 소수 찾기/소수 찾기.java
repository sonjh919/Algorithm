import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    static int N,count=0;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //when
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            if(isPrime(Integer.parseInt(st.nextToken()))) count++;
        }

        bw.write(String.valueOf(count));

        //then
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isPrime(int num) {
        if(num==1)return false;
        if(num==2)return true;
        for (int i = 2; i < num; i++) {
            if(num%i==0)return false;
        }
        return true;
    }

}
