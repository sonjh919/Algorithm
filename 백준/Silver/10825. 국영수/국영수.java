import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        int N = Integer.parseInt(br.readLine());

        Score[] score = new Score[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            score[i] = new Score(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(score);

        for (int i = 0; i < N; i++) {
            bw.write(score[i].name + "\n");
        }

        // output
        bw.flush();
        br.close();
        bw.close();
    }

    private static class Score implements Comparable<Score> {
        String name;
        int korean;
        int english;
        int math;

        public Score(final String name, final int korean, final int english, final int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        @Override
        public int compareTo(final Score o) {
            // 문제 기준: 내림차순 > 오름차순 > 내림차순 > 이름 오름차순
            if (this.korean != o.korean) {
                return o.korean - this.korean;  // 국어 내림차순
            }
            if (this.english != o.english) {
                return this.english - o.english; // 영어 오름차순
            }
            if (this.math != o.math) {
                return o.math - this.math; // 수학 내림차순
            }
            return this.name.compareTo(o.name); // 이름 오름차순
        }
    }
}

