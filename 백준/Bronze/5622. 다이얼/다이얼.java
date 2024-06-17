import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static String S;
    static int sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        S = br.readLine();
        for (int i = 0; i < S.length(); i++) {
            sum += dial(S.charAt(i));
        }

        bw.write(String.valueOf(sum));

        bw.flush();
        bw.close();
        br.close();
    }

    private static int dial(char c) {
        if('A' <= c && c <= 'C') return 3;
        else if (c <= 'F') return 4;
        else if (c <= 'I') return 5;
        else if (c <= 'L') return 6;
        else if (c <= 'O') return 7;
        else if (c <= 'S') return 8;
        else if (c <= 'V') return 9;
        else return 10;
    }
}
