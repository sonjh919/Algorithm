import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Set<Integer> set = new HashSet<>();
        // input
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            String[] s = br.readLine().split(" ");

            int input = 0;
            if(s.length==2){
                input = Integer.parseInt(s[1]);
            }

            switch (s[0]) {
                case "add" -> set.add(input);
                case "remove" -> set.remove(input);
                case "check" -> {
                    if (set.contains(input))
                        sb.append("1\n");
                    else
                        sb.append("0\n");
                }
                case "toggle" -> {
                    if (set.contains(input))
                        set.remove(input);
                    else
                        set.add(input);
                }
                case "all" -> {
                    set = new HashSet<>();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                }
                case "empty" -> set.clear();
            }

        }
//      output
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
