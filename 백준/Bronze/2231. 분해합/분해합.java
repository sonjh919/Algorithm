import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int N, sum=0;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        //when
        for (int i = 1; i <= N; i++) {
            if(sum(i)){
                sum=i;
                break;
            }
            list.clear();
        }

        bw.write(String.valueOf(sum));

        //then
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean sum(int num) {
        int temp = num;
        int sum = 0;
        while(true){
            list.add(temp%10);
            temp /= 10;
            if(temp==0)break;
        }

        for (int i = list.size()-1 ; i >= 0 ; i--) {
            sum += list.get(i);
        }
        sum += num;
        return sum == N;
    }

}
