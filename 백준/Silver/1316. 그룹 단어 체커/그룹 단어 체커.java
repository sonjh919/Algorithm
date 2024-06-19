import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static String S;
    static List<Character> ch = new ArrayList<>();
    static Set<Character> ch2 = new HashSet<>();
    static int T, count=0;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        //when
        for (int i = 0; i < T; i++) {
            S = br.readLine();

            for (int j = 0; j < S.length(); j++) {
                ch.add(S.charAt(j));
            }

            for (int j = 0; j < ch.size()-1; j++) {
                if(ch.get(j) == ch.get(j+1)) {
                    ch.remove(j);
                    j--;
                }

            }

            ch2.addAll(ch);

            if(ch.size()==ch2.size())count++;
            ch.clear();
            ch2.clear();

        }

        bw.write(String.valueOf(count));

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
