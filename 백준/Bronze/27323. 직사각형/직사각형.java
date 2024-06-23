import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static int A,B;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //when
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(A*B));

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
