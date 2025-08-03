import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/*
시간제한 2초: 최대 계산 횟수는 2억번
N <= 1000, O(n^2)도 가능
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input
        int N = Integer.parseInt(br.readLine());
        String[] scores = br.readLine().split(" ");

        // 1. max
        int max = Integer.MIN_VALUE;
        for (final String s : scores) {
            max = Math.max(max, Integer.parseInt(s));
        }

        // 2. 점수 고치기
        List<Double> changeScores = new ArrayList<>();

        for (final String s : scores) {
            changeScores.add(Double.parseDouble(s)/max*100);
        }

        // 3. 평균 구하기
        double average = 0;
        for (final Double changeScore : changeScores) {
            average += changeScore;
        }

        average /= changeScores.size();

        // output
        bw.write(average + "");

        // close
        bw.flush();
        br.close();
        bw.close();
    }
}

