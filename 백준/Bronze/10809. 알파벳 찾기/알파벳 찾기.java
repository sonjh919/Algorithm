import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    static String S;
    static int temp;
    static int[] list = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        S = br.readLine();

        Arrays.fill(list, -1);
        for (int i = 0; i < S.length(); i++) {
            temp =S.charAt(i)-'a';

            if(list[temp] == -1)
                list[temp] = i;
        }

        for (int i : list) {
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
