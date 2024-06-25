import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] board;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N,M;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = temp.charAt(j) == 'W';
            }
        }

        int min = Integer.MAX_VALUE;
        //when
        for (int i = 0; i <= N-8; i++) {
            for (int j = 0; j <= M-8; j++) {
                min = Math.min(min, count(i,j));
            }
        }

        bw.write(String.valueOf(min));

        //then
        bw.flush();
        bw.close();
        br.close();
    }

    private static int count(int i, int j) {
        int count = 0;
        boolean flag = board[i][j];
        for (int k = i; k < i+8; k++) {
            for (int l = j; l < j+8; l++) {
                if (board[k][l]!=flag)count++;
                flag = (!flag);
            }
            flag = (!flag);
        }
        return Math.min(count,64-count);
    }


}
