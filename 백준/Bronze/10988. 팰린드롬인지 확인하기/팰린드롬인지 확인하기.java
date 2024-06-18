import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static String S;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder(br.readLine());

        //when
        S = sb.toString();

        if(S.contentEquals(sb.reverse())) bw.write(String.valueOf(1));
        else bw.write(String.valueOf(0));

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
