import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);
        int exception = (int) Math.round(N * 0.15);

        int sum = 0;
        int count = 0;
        for (int i = exception; i < list.size() - exception; i++) {
            sum += list.get(i);
            count++;
        }

        bw.write(Math.round((float) sum / count) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

}
