import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    static char[][] map = new char[5][15];

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        //when
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            String tmp = st.nextToken();
            for (int j = 0; j < tmp.length(); j++) {
                map[i][j] = tmp.charAt(j);
            }
            for (int j = tmp.length(); j < 15; j++) {
                map[i][j] = '!';
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(map[j][i]=='!')continue;
                bw.write(map[j][i]);
            }
        }


        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
