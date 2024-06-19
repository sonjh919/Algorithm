import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static double sum = 0;
    static double totalscore = 0;
    static double score;
    static String grade;

    static Map<String, Double> map = Map.of(
        "F",0.0,
        "D0",1.0,
        "D+",1.5,
        "C0",2.0,
        "C+",2.5,
        "B0",3.0,
        "B+",3.5,
        "A0",4.0,
        "A+",4.5
    );

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;


        //when
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            score = Double.parseDouble(st.nextToken());
            grade = st.nextToken();

            if(grade.equals("P"))continue;

            totalscore += score;
            sum += score*map.get(grade);
        }

        bw.write(String.format("%.6f", (sum / totalscore)));

        //then
        bw.flush();
        bw.close();
        br.close();
    }


}
