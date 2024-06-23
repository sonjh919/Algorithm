import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static int A,B,C;
    
    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());

        //when
        if(A+B+C==180){
            if(A==B && B==C) bw.write("Equilateral");
            else if (A!=B && B!=C && A!=C) bw.write("Scalene");
            else bw.write("Isosceles");
        }
        else bw.write("Error");

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
