import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
시간제한 3초: 최대 계산 횟수는 3억번

1 <= N <= 1,000
0 ≤ M ≤ N×(N-1)/2

N의 최댓값 1,000 / M의 최댓값 499,500(=1,000×999/2)

시간 복잡도 : O(N^2)가능, O(N+M) 가능.
dfs는 O(N+M)
*/
public class Main {

    static ArrayList<Integer>[] edges;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 인접 리스트로 그래프 표현하기
        // 정점을 한번 방문하면 더 이상 방문하면 안됨 -> visited
        edges = new ArrayList[n+1]; // 0 빼고 1~n까지
        visited = new boolean[n+1];
        for (int i = 1; i < n+1; i++) {
            edges[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            edges[n1].add(n2);
            edges[n2].add(n1);
        }

        int count = 0;
        for (int i = 1; i < edges.length; i++) { // 모든 노드에 대해
            if(!visited[i]){
                count++; // 방문 안했으면 연결 요소가 다르다는 이야기 -> 갯수 추가
                dfs(i);
            }
        }

        bw.write(count+"");

        // close
        bw.flush();
        bw.close();
        br.close();
    }

    // 재귀로 구현
    private static void dfs(final int i) {
        if(visited[i])return; // 방문 했으면 패스
        visited[i]=true; // 방문 안했으면 방문 처리
        for (final Integer node : edges[i]) { // 각 노드마다
            if(!visited[node]) // 방문 안했으면
                dfs(node); // dfs 재귀돌기
        }
    }
}
