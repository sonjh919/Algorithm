import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    static int X1,Y1, X2,Y2, X3,Y3;
    static int X4,Y4;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        X1 = Integer.parseInt(st.nextToken());
        Y1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        X2 = Integer.parseInt(st.nextToken());
        Y2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        X3 = Integer.parseInt(st.nextToken());
        Y3 = Integer.parseInt(st.nextToken());

        //when
        if(X1==X2) X4=X3;
        else if(X2==X3) X4=X1;
        else X4=X2;

        if(Y1==Y2) Y4=Y3;
        else if(Y2==Y3) Y4=Y1;
        else Y4=Y2;

        bw.write(X4 + " " + Y4);

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
