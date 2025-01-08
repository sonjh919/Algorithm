import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T =  Integer.parseInt(br.readLine());
        int N, M;


        Queue<Doc> queue = new LinkedList<>();

        for (int i = 0; i < T; i++) {
            queue.clear();
            String[] s = br.readLine().split(" ");
            N = Integer.parseInt(s[0]);
            M = Integer.parseInt(s[1]);
            String[] n = br.readLine().split(" ");

            for (int j = 0; j < N; j++) {
                queue.offer(new Doc(j, Integer.parseInt(n[j])));
            }

            int count = checkCount(queue, M);
            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static int checkCount(Queue<Doc> queue, int M) {
        int count = 0;
        while (true) {
            Doc d = queue.poll();
            if(checkIsImportant(d, queue)){
                count++;
                if(d.getOrder()==M)return count;
            }
            else{
                queue.offer(d);
            }
        }
    }

    private static boolean checkIsImportant(Doc d, Queue<Doc> queue) {
        for (Doc doc : queue) {
            if(d.getImportant() < doc.getImportant()){
                return false;
            }
        }
        return true;
    }

    static class Doc{
        private int order;
        private int important;

        public Doc(int order, int important){
            this.order = order;
            this.important = important;
        }

        public int getOrder() {
            return order;
        }

        public int getImportant(){
            return important;
        }
    }

}
