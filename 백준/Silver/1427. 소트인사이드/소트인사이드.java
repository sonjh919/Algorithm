import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] array = br.readLine().toCharArray();

        //when
        Arrays.sort(array);

        for (int i = array.length-1; i >=0 ; i--) {
            bw.write(String.valueOf(array[i]-'0'));
        }

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
