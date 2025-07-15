import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[][] students;
    static boolean[] chk;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        students = new int[n + 1][4];
        chk = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());

            for (int j = 0; j < 4; j++) {
                students[idx][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 국어, 영어, 수학, 과학에 대해 최고점을 받은 학생 찾기
        for (int i = 0; i < 4; i++) {
            find(i);
        }
    }

    public static void find(int idx) {
        int max = -1;
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            // 상품을 받지 않은 학생 중에서 가장 높은 점수를 받은 학생 선택
            if (!chk[i] && students[i][idx] > max) {
                ans = i;
                max = students[i][idx];
            }
        }

        chk[ans] = true; // 이 학생은 상품을 받았다고 체크
        System.out.print(ans + " ");
    }
}
