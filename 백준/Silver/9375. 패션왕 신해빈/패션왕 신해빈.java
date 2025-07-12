import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            if(N==0){
                bw.write("0\n");
                continue;
            }

            Map<String, Integer> map = new HashMap<>();

            for (int j = 0; j < N; j++) {
                String[] s = br.readLine().split(" ");
                map.put(s[1], map.getOrDefault(s[1],0)+1);
            }

            int sum = 1;
            for (String s : map.keySet()) {
                sum *= map.get(s)+1;
            }

            sum--;
            bw.write(sum+"\n");

        }
        br.close();
        bw.close();
    }

}
