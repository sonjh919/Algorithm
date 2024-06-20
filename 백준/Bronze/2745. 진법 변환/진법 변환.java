import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    static String N;
    static int B, num, sum=0, idx = 0;
    static char C;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        //when
        N = st.nextToken();
        B = Integer.parseInt(st.nextToken());

        for (int i = N.length()-1; i >=0 ; i--) {
            C = N.charAt(i);
            if('A'<=C && C<='Z')
                num = C-55;
            else
                num = C-'0';
            sum += (int) (num*Math.pow(B,idx++));
        }

        bw.write(String.valueOf(sum));


        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
