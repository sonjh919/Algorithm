import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int temp;
        for (int i = 0; i < 5; i++) {
            temp = Integer.parseInt(br.readLine());
            list.add(temp);
            sum += temp;
        }

        //when
        Collections.sort(list);

        bw.write(sum/5 + "\n" +  list.get(2) );

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
