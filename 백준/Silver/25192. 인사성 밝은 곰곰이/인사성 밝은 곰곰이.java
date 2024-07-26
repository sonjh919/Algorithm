import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String S;
        int count = 0;
        for (int i = 0; i < N; i++) {
            S = br.readLine();
            if(!S.equals("ENTER"))set.add(S);
            else{
                count += set.size();
                set.clear();
            }
        }

        bw.write(count+set.size()+"");

        bw.flush();
        bw.close();
        br.close();
    }

}
