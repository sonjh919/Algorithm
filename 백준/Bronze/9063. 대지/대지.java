import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    static int N,X,Y;
    static int x_min = Integer.MAX_VALUE, x_max = Integer.MIN_VALUE;
    static int y_min = Integer.MAX_VALUE, y_max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());

            //when
            x_min = Math.min(x_min,X);
            x_max = Math.max(x_max,X);
            y_min = Math.min(y_min,Y);
            y_max = Math.max(y_max,Y);
        }
        bw.write(String.valueOf((x_max-x_min)*(y_max-y_min)));

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
