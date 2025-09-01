import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
시간제한 10초: 최대 계산 횟수는 10억번..?

1 <= N < 15

O(2^N)도 가능..? 시간복잡도 고려하지말고 풀란 말인듯?
*/
public class Main {

    static boolean[][] visited;
    static int count = 0;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N][N];

        // 가로, 세로, 대각선에 겹치면 안됨
        /*
        모든 칸을 시작점으로 하나씩 다 해보기 -> 겹치는거 있을 것 같음.
        -> 가로줄마다 하나씩 들어감 -> 각 줄을 tree의 depth라 생각하면 dfs 가능.
         */
        dfs(0);

        bw.write(count+"");

        // close
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int row) { // 가로줄 선택
        if (row==N){
            count++;
            return;
        }

        for (int col = 0; col < N; col++) { // 세로줄마다
            if(cantVisited(row, col)){
                visited[row][col] = true;
                dfs(row+1); // 재귀 = for
                visited[row][col] = false;  // 못가는 부분을 싹다 true 처리하려고 하니 되돌리는게 너무 어려움.. -> 실제 놓은자리만 true로 변경
            }
        }

    }

    static boolean cantVisited(int row, int col){
        for (int i = 0; i < N; i++) {
            if(visited[i][col])return false; //세로
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < N; j++) {
                if(Math.abs(j-col) == Math.abs(i-row) && visited[i][j])return false; // 대각선
            }
        }

        return true;
    }

}

/*
ㅡㅡㅡㅡ
ㅡㅡㅡㅡ
ㅡㅡㅡㅡ
ㅡㅡㅡㅡ

00 01 02 03
10 11 12 13
20 21 22 23
 */
