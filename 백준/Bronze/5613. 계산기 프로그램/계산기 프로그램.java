import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = Integer.parseInt(br.readLine());

        String s;
        while(true){
            s = br.readLine();
            if(s.equals("="))break;
            else if(s.equals("+")) sum += Integer.parseInt(br.readLine());
            else if(s.equals("-")) sum -= Integer.parseInt(br.readLine());
            else if(s.equals("*")) sum *= Integer.parseInt(br.readLine());
            else if(s.equals("/")) sum /= Integer.parseInt(br.readLine());
        }

        bw.write(sum+"");

        br.close();
        bw.close();
    }

}
