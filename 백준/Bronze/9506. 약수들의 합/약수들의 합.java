import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static int A, sum;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            A = Integer.parseInt(br.readLine());
            sum = 0;
            list.clear();

            if(A==-1)break;

            //when
            for (int i = 1; i <= Math.sqrt(A); i++) {
                if(A%i==0){
                    list.add(i);
                    list.add(A/i);
                }
            }

            list = list.stream().distinct().sorted().collect(Collectors.toList());

            for (int i = 0; i < list.size()-1; i++) {
                sum += list.get(i);
            }

            if(A==sum){
                bw.write(A + " = ");
                for (int i = 0; i < list.size()-2; i++) {
                    bw.write(list.get(i) + " + ");
                }
                bw.write(list.get(list.size()-2)+"\n");
            }
            else bw.write(A + " is NOT perfect.\n");
        }

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
