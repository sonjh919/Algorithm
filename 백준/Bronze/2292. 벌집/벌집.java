import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static int N, count = 1;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        //when
        N = Integer.parseInt(br.readLine());

        int i=1;
        while (count < N) {
            count = count + 6 * i++;
        }

        bw.write(String.valueOf(i));

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
