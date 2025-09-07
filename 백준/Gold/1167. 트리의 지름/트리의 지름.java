import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Node {
        int to, cost;
        Node(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
    static List<Node>[] tree;
    static boolean[] visited;
    static int farthestNode; // (3) 임의의 정점에서 가장 먼 노드 저장
    static int maxDist;      // (4) 최장 거리, 즉 트리 지름

    public static void main(String[] args) throws Exception {
        // (1) 트리의 기본 개념: 입력받아 인접 리스트로 트리 구축
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());
        tree = new ArrayList[V+1];
        for (int i = 1; i <= V; i++) tree[i] = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            while (true) {
                int to = Integer.parseInt(st.nextToken());
                if (to == -1) break;
                int cost = Integer.parseInt(st.nextToken());
                tree[from].add(new Node(to, cost));
            }
        }

        // (2) 그래프 탐색: 첫 번째 탐색 (임의의 점에서 가장 먼 정점 찾기)
        visited = new boolean[V+1];
        maxDist = 0;
        dfs(1, 0); // 임의의 정점 1에서 시작

        // (3) 두 번째 탐색: 찾은 정점(farthestNode)에서 가장 먼 노드까지의 거리 구하기 (트리의 지름)
        visited = new boolean[V+1];
        maxDist = 0;
        dfs(farthestNode, 0);

        // (4) 출력: 트리의 지름
        System.out.println(maxDist);
    }

    // (2, 3, 4) DFS, 거리 합산: 가중치가 있는 트리에서 거리 누적(서브 문제 4)
    static void dfs(int node, int dist) {
        visited[node] = true;
        if (dist > maxDist) {
            maxDist = dist;
            farthestNode = node;
        }
        for (Node next : tree[node]) {
            if (!visited[next.to]) {
                dfs(next.to, dist + next.cost);
            }
        }
    }
}
