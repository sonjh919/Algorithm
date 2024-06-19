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

        S = br.readLine();

        //when
        S = S.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "!");
        bw.write(String.valueOf(S.length()));

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
