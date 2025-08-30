import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


/*
시간제한 1초: 최대 계산 횟수는 1억번

(1 ≤ M ≤ N ≤ 8) -> 10,000,000

시간 복잡도 : O(2^N) 까지 가능
*/
public class Main {

    static int n;
    static int m;

    static boolean[] visited;

    static List<List<Integer>> answer = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        List<Integer> list;
        for (int i = 1; i <= n; i++) {
            list = new ArrayList<>();
            visited = new boolean[n+1];
            dfs(list, i);
        }

        for (List<Integer> lists : answer) {
            for (Integer i : lists) {
                bw.write(i + " ");
            }
            bw.write("\n");
        }

        // close
        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(List<Integer> list, int num) {
        list.add(num);

        if(visited[num] || list.size()>m)return;
        if(list.size()==m){
            answer.add(list);
            return;
        }

        visited[num]=true;

        for (int i = 1; i <= n; i++) {
            if(!visited[i]){
                dfs(new ArrayList<>(list), i);
                visited[i]=false;
            }
        }
    }
}
