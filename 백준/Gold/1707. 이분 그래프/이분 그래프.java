import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<List<Integer>> graph = new ArrayList<>();
    static int[] visited;
    static int K,V,E,u,v;
    static boolean isBipartite;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());

            visited = new int[V+1];
            isBipartite = true;
            graph.clear();
            for (int j = 0; j <= V; j++) {
                graph.add(new ArrayList<>());
            }

            for (int j = 0; j < E; j++) {
                st = new StringTokenizer(br.readLine());
                u = Integer.parseInt(st.nextToken());
                v = Integer.parseInt(st.nextToken());

                graph.get(u).add(v);
                graph.get(v).add(u);
            }
            
            for (int j = 1; j <= V; j++) {
                if (visited[j] == 0 && isBipartite) {
                    DFS(j, 1);
                }
            }
            bw.write(isBipartite?"YES\n":"NO\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void DFS(int node, int color) {
        visited[node] = color;

        for (int next : graph.get(node)) {
            if (visited[next] == 0) {
                DFS(next, -color);
            } else if (visited[next] == visited[node]) {
                isBipartite = false;
                return;
            }
        }
    }
}
