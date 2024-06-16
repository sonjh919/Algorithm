import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
        static int N,M;
        static int i,j;
        static int[] arr;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            // N M 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            // 배열 0 초기화
            arr = new int[N];
            for(int i1=0;i1<N;i1++){
                arr[i1] = i1+1;
            }


            for (int i1 = 0; i1 < M; i1++) {
                st = new StringTokenizer(br.readLine());
                i = Integer.parseInt(st.nextToken())-1;
                j = Integer.parseInt(st.nextToken())-1;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            for(int i1=0;i1<N;i1++){
                bw.write(arr[i1] + " ");
            }

            bw.flush();
            bw.close();
            br.close();
        }
}
