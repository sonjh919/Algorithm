import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] map;
    static List<Integer> count = new ArrayList<>();
    static int count_dfs=0;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        map = new boolean[N+1][N+1];


        for (int i = 0; i < N; i++) {
            char[] a = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                if(a[j]=='1')map[i][j]=true;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j]){
                    count.add(DFS(i,j));
                }
                count_dfs=0;
            }
        }

        bw.write(count.size()+"\n");
        Collections.sort(count);
        for (Integer integer : count) {
            bw.write(integer + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static int DFS(int i,int j) {
        map[i][j] = false;
        count_dfs++;

        // i--
        if(i > 0 && map[i-1][j])DFS(i-1,j);

        // j--
        if(j > 0 && map[i][j-1])DFS(i,j-1);

        // i++
        if(i < N-1 && map[i+1][j])DFS(i+1,j);

        //j++
        if(j < N-1 && map[i][j+1])DFS(i,j+1);

        return count_dfs;
    }


}
