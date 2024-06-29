import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        list.sort((s1, s2) -> {
            if(s1.length() == s2.length()) return s1.compareTo(s2);
            else return s1.length() - s2.length();  // 양수일 경우 자리 바꾸기
        });
        
        list = list.stream().distinct().collect(Collectors.toList());

        //when
        for (String s : list) {
            bw.write(s + "\n");
        }

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
