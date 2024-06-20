import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int N,B;
    static List<Character> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        //when
        N = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        while(N>0){
            if(N % B < 10)list.add((char) ((N%B) + '0'));
            else list.add((char) ((N%B) - 10 + 'A'));
            N /= B;
        }

        for (int i = list.size()-1; i >=0 ; i--) {
            bw.write(list.get(i));
        }


        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
