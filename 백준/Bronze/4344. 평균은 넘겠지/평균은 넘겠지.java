import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {
            String[] s = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]);

            List<Integer> score = new ArrayList<>();
            for (int j = 1; j <= N; j++) {
                score.add(Integer.parseInt(s[j]));
            }

            int sum = score.stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            double average = (double) sum / score.size();

            long over = score.stream()
                    .filter(student -> student>average)
                    .count();

            double l = (double) over / score.size() * 100;

            bw.write(String.format("%.3f", l)+"%\n");

        }

        br.close();
        bw.close();
    }

}
