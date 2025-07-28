import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int X = Integer.parseInt(br.readLine());

        int a = 0;
        int b = 1;

        for (int i = 1; i <= X; i++) {
            if((a+b) % 2==0){
                a--;
                b++;
            }else{
                a++;
                b--;
            }


            if(a==0)a++;
            if(b==0)b++;

        }

        bw.write(a + "/" + b);

        // output
        bw.flush();
        br.close();
        bw.close();
    }
}

