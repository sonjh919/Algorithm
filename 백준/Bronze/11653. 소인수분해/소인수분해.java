import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static int N;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //when
        N = Integer.parseInt(br.readLine());
        
        int i=2;
        while(N>1){
            if(N%i==0){
                N/=i;
                bw.write(i+"\n");
            }
            else i++;
        }

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
