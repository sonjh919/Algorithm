import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
        static int[] arr = new int[9];
        static int max = Integer.MIN_VALUE;
        static int index;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            for(int i=0;i<9;i++){
                arr[i] = Integer.parseInt(br.readLine());
            }

            for(int i=0;i<9;i++){
                if(arr[i]>max){
                    max = arr[i];
                    index = i;
                }

            }

            bw.write(String.valueOf(max) + "\n" + String.valueOf(index+1));

            bw.flush();
            bw.close();
            br.close();
        }
}
