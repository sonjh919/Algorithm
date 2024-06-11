import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

        static int A;
        static int B;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            B -= 45;
            if(B < 0) {
                B += 60;
                A--;
                if (A < 0) {
                    A += 24;
                }
            }

            bw.write(String.valueOf(A) + " " + String.valueOf(B) + "\n");

            bw.flush();
            bw.close();
            br.close();
        }
    }
