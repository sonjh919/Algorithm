import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static int T, C;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        //when
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            C = Integer.parseInt(br.readLine());

            bw.write(C/25 + " ");
            C %=25;

            bw.write(C/10 + " ");
            C %=10;

            bw.write(C/5 + " ");
            C %=5;

            bw.write(C + "\n");
        }


        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
