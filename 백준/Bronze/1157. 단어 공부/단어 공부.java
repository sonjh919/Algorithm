
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] count = new int[26];

        String s = br.readLine();
        s = s.toUpperCase();

        // count 대입
        for(int i=0;i<s.length();i++){
            count[s.charAt(i) - 'A']++;
        }



        // 제일 큰거 찾기
        int max = Integer.MIN_VALUE;
        int alphabet = -1;

        for (int i=0;i<count.length;i++){
            if(count[i] > max) {
                max = count[i];
                alphabet = i;
            }
        }

        int duplicate = 0;
        for(int c: count){
            if(max == c)duplicate++;
        }

        if(duplicate>=2){
            bw.write("?");
        }
        else{
            bw.write(alphabet+'A');
        }


        // input

        // close
        bw.flush();
        bw.close();
        br.close();
    }
}
