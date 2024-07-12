import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<int[]> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.add(new int[]{i, Integer.parseInt(st.nextToken())});
        }

        int[] num = queue.removeFirst();
        bw.write(num[0]+" ");

        while(!queue.isEmpty()){
            if(num[1]>0){
                for (int i = 0; i <num[1]-1; i++)queue.addLast(queue.removeFirst());
                num = queue.removeFirst();
                bw.write(num[0]+" ");
            }
            else{
                for (int i = 0; i <Math.abs(num[1])-1; i++)queue.addFirst(queue.removeLast());
                num = queue.removeLast();
                bw.write(num[0]+" ");
            }

        }


        bw.flush();
        bw.close();
        br.close();
    }

}
