import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static boolean[] arr = new boolean[30];
    static int temp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0;i<28;i++){
            temp = Integer.parseInt(br.readLine())-1;
            arr[temp] = true;
        }

        for(int i=0;i<30;i++){
            if(!arr[i]) bw.write(String.valueOf(i+1) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
