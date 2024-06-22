import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int A,B;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            if(A==0 && B==0)break;

            //when
            if(A>B && A%B==0) bw.write("multiple\n");
            else if(A<B && B%A==0) bw.write("factor\n");
            else bw.write("neither\n");
        }

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
