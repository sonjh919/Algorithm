import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static List<Integer> graph_dfs = new ArrayList<>();
    static List<Integer> graph_bfs = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        visited = new boolean[N+1];
        int u,v;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        DFS(V);
        visited= new boolean[N+1];
        BFS(V);

        for (Integer node : graph_dfs) {
            bw.write(node + " ");
        }
        bw.write("\n");
        for (Integer node : graph_bfs) {
            bw.write(node + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();

        visited[node] = true;
        graph_bfs.add(node);
        queue.add(node);

        while(!queue.isEmpty()){
            int tmp = queue.poll();

            for(Integer next : graph.get(tmp)){
                if(!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                    graph_bfs.add(next);
                }
            }
        }
    }

    private static void DFS(int node) {
        visited[node] = true;
        graph_dfs.add(node);

        for(Integer next : graph.get(node)){
            if(!visited[next]) DFS(next);
        }

    }


}
