import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = read(), r = read(), a = 100, b = -100;
        int[][] mat = new int[n][2];
        for (int i = 0; i < n; i++) {
            a = Math.min(a, mat[i][0] = read());
            b = Math.max(b, mat[i][0]);
            mat[i][1] = read();
        }

        int max = -100, y = 0, x = 0;
        for (int i = a; i <= b; i++) {
            for (int j = a; j <= b; j++) {
                int cnt = 0;
                for (int[] c : mat) if (Math.sqrt(Math.pow(i - c[0], 2) + Math.pow(j - c[1], 2)) <= r) cnt++;

                if (max < cnt) {
                    max = cnt;
                    y = i;
                    x = j;
                }
            }
        }

        bw.write(y + " " + x);
        bw.flush();
    }

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        boolean flag = n == 13;

        if (flag) n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);

        return flag ? ~n + 1 : n;
    }

}