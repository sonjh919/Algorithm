import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        String[][] array = new String[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            array[i][0] = st.nextToken();
            array[i][1] = st.nextToken();
        }

        //when
        Arrays.sort(array, (a1,a2) -> Integer.parseInt(a1[0]) - Integer.parseInt(a2[0]));

        for (String[] strings : array) {
            bw.write(strings[0] + " " + strings[1] + "\n");
        }


        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
