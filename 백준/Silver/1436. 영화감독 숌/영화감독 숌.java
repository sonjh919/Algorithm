import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int num = 666, count=1;

        while(count != N){
            num++;
            if(String.valueOf(num).contains("666"))count++;
        }

        bw.write(String.valueOf(num));
        //then
        bw.flush();
        bw.close();
        br.close();
    }



}
