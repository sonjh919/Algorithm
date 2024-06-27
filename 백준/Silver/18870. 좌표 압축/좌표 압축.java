import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        //when
        List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
//        Set<Integer> set = new HashSet<>(list);
//        List<Integer> list2 = new ArrayList<>(set);
        Collections.sort(list2);
        Object[] sorted = list2.toArray();
        for (Integer integer : list) {
            bw.write(Arrays.binarySearch(sorted, integer)+" ");
        }

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
