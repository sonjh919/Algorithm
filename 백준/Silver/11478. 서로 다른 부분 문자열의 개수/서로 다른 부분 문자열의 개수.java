import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String S = st.nextToken();

        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j < S.length(); j++) {
                sb.append(S.charAt(j));
                set.add(sb.toString());
            }
            sb = new StringBuilder();
        }

        bw.write(String.valueOf(set.size()));

        bw.flush();
        bw.close();
        br.close();
    }

}
