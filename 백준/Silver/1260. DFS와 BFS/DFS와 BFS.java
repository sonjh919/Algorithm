import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
시간제한 2초: 최대 계산 횟수는 2억번
N(1 ≤ N ≤ 1,000), M(1 ≤ M ≤ 10,000)
O(N+M) 가능 -> dfs/bfs 가능
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
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        edges = new ArrayList[N+1];
        for (int i = 0; i <= N; i++) {
            edges[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            edges[n1].add(n2);
            edges[n2].add(n1);
        }

        for (int i = 0; i <= N; i++) {
            Collections.sort(edges[i]);
        }

        visited = new boolean[N+1];
        dfs(V);
        System.out.println();
        visited = new boolean[N+1];
        bfs(V);

        // close
        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for (Integer i : edges[v]) {
            if(!visited[i]){
                dfs(i);
            }
        }
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v]=true;

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node + " ");

            for (Integer i : edges[node]) {
                if(!visited[i]){
                    visited[i]=true;
                    queue.add(i);
                }
            }
        }

    }

}
