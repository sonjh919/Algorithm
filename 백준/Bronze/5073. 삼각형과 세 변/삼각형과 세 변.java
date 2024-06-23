import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    static List<Integer> list = new ArrayList<>();
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            list.clear();
            set.clear();
            list.add(Integer.parseInt(st.nextToken()));
            list.add(Integer.parseInt(st.nextToken()));
            list.add(Integer.parseInt(st.nextToken()));

            if(list.get(0)==0 && list.get(1)==0 && list.get(2)==0)break;

            //when
            Collections.sort(list);
            if(list.get(0)+list.get(1)<=list.get(2)) bw.write("Invalid\n");
            else{
                set = new HashSet<>(list);
                switch (set.size()){
                    case 3: bw.write("Scalene\n");break;
                    case 2: bw.write("Isosceles\n");break;
                    case 1: bw.write("Equilateral\n");break;
                }
            }
        }
        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
