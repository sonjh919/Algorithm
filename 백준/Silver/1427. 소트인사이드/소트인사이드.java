import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
시간제한 2초: 최대 계산 횟수는 2억번
N <= 1,000,000,000
O(N)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split("");

        List<Integer> list = new ArrayList<>();

        for (String s : str) {
            list.add(Integer.parseInt(s));
        }

        list.sort(Comparator.reverseOrder());

        for (Integer i : list) {
            bw.write(i+"");
        }

        // close
        bw.flush();
        br.close();
        bw.close();
    }
}

