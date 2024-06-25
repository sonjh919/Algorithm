import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int a,b,c,d,e,f;

        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());

        for (int i = -999; i <=999 ; i++) {
            for (int j = -999; j <=999 ; j++) {
                if(a*i+b*j==c && d*i+e*j==f)bw.write(i + " "+ j);
            }
        }

        //then
        bw.flush();
        bw.close();
        br.close();
    }



}
