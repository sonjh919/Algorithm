import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split("");
            bw.write(setScore(input) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private static int setScore(String[] input) {
        int sum = 0;
        int sequence = 0;

        for (String s : input) {
            if(s.equals("O")){
                sequence++;
                sum += sequence;
            }
            else{
                sequence = 0;
            }
        }

        return sum;
    }

}
