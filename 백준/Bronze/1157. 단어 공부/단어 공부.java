import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static String S;
    static int[] list = new int[26];
    static int max = 0;
    static char s;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        S = br.readLine().toUpperCase();

        //when
        for (int i = 0; i < S.length(); i++) {
            list[S.charAt(i)-'A']++;
        }

        for (int i = 0; i < list.length; i++) {
            if(max<list[i]){
                max=list[i];
                s = (char)(i+'A');
            }
            else if (max==list[i])
                s = '?';
        }

        bw.write(s);

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
