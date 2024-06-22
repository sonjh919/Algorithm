import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static int A,B;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        //when
        for (int i = 1; i <= Math.sqrt(A); i++) {
            if(A%i==0){
                list.add(i);
                list.add(A/i);
            }
        }

        list = list.stream().distinct().sorted().collect(Collectors.toList());

        if(list.size()<B) bw.write(String.valueOf(0));
        else bw.write(String.valueOf(list.get(B-1)));

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
