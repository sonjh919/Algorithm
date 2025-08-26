import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
시간제한 2초: 최대 계산 횟수는 2억번

N (5 ≤ N ≤ 2000)
M (1 ≤ M ≤ 2000)

O(N^2), O(N*M), O(M^2) 가능!
*/
//44% 틀림..
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

        // edges 세팅
        edges = new ArrayList[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            edges[i] = new ArrayList<>();
        }

        // edges 입력받기
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            edges[n1].add(n2);
            edges[n2].add(n1);
        }

        // A -> B -> C -> D -> E 만족 = 5단계 들어가면 됨.
        for (int i = 0; i < edges.length; i++) { // 각 노드에서 시작!
            Arrays.fill(visited, false); // 각 연결요소마다 초기화시키기!
            if(dfs(i, 1)>=5){ // dfs에서 노드 연결 길이가 5보다 크다면
                System.out.println(1); // 만족
                return;
            }
        }

        System.out.println(0);

        // close
        bw.flush();
        bw.close();
        br.close();
    }

    private static int dfs(int num, int count) {
        visited[num]=true; // 시작 노드 방문 처리
        int max = count; // 현재 접근 카운트
        for (final Integer i : edges[num]) { // 한 노드에서 연결된 엣지들에 방문하기
            if(!visited[i]) // 아직 방문하지 않았다면
                max = Math.max(max, dfs(i, count+1)); // 방문하고, 접근 카운트 하나 추가.
        }
        if(max<5)visited[num]=false; // 5 이하면 방문 안함처리
        return max;
    }
}
/*
반례 : 1 3 필요없는데 갔다오느라 visited되어서 4 -> 3 에서 막힘.
5 5
0 1
1 3
1 4
4 3
3 2
 */