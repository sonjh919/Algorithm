import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
시간제한 2초: 최대 계산 횟수는 2억번
음 어떻게 계산해야하지
*/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input
        String s = br.readLine();

        // 첫 - 나오는 기점으로 뒤는 싹다 -로 처리하기!
        int sum = 0;

        // - 없으면 싹다 더하기
        if(!s.contains("-")){
            final String[] split = s.split("\\+");
            for (final String string : split) {
                sum += Integer.parseInt(string);
            }
            bw.write(sum+"");
            bw.flush();
            return;
        }

        // - 있을 때
        final String[] split = s.split("-");

        // 첫 - 기점으로 앞에 다 더하고 뒤에 다 빼기
        final String[] split1 = split[0].split("\\+");
        for (final String string : split1) {
            sum += Integer.parseInt(string);
        }

        for (int i = 1; i < split.length; i++) {
            final String[] split2 = split[i].split("\\+");
            for (final String string : split2) {
                sum -= Integer.parseInt(string);
            }
        }

        bw.write(sum+"");

        // close
        bw.flush();
        bw.close();
        br.close();
    }
}
