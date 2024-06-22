import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int A,B,V;
    static int count=0;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        //when
        if(A-B == 1) count = V-B;
        else{
            count = (V-B)/(A-B);
            if((V-B)%(A-B) != 0) count++;
        }

        bw.write(String.valueOf(count));

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
