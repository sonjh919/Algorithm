import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//      input
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            String[] s1 = s.split(" ");
            int location = Integer.parseInt(s1[0])-1;
            String str = s1[1];

            StringBuilder sb = new StringBuilder();

            for(int j=0;j<str.length();j++){
                if(j==location)continue;
                sb.append(str.charAt(j));
            }
            bw.write(sb.toString()+"\n");
        }

//      output
        br.close();
        bw.close();
    }
}
