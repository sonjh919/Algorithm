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

        while (true) {
            String[] s = br.readLine().split(" ");
            if (s[0].equals("0") && s[1].equals("0") && s[2].equals("0")) {
                break;
            }

            List<Integer> list = new ArrayList<>();
            list.add(Integer.parseInt(s[0]));
            list.add(Integer.parseInt(s[1]));
            list.add(Integer.parseInt(s[2]));

            Collections.sort(list);
            int a = list.get(0);
            int b = list.get(1);
            int c = list.get(2);

            if (a * a + b * b == c * c) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }

        }

        bw.flush();
        bw.close();
        br.close();

    }

}