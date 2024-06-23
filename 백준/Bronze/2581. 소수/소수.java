import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static int M,N, sum, min;
    static boolean flag = true;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //when
        M = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());

        for (int i = M; i <= N; i++) {
            if(isPrime(i)){
                if(flag){
                    min = i;
                    flag = false;
                }
                sum += i;
            }
        }

        if(flag)bw.write(String.valueOf(-1));
        else bw.write(sum + "\n" + min);

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
