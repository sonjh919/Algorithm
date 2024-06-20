import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static int N, count = 2;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        //when
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            count = 2*count-1;
        }

        bw.write(String.valueOf(count*count));


        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
