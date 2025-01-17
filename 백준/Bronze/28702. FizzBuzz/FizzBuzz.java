import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        int next = 0;
        if(isInteger(a)){
            next = Integer.parseInt(a)+3;
        }
        else if(isInteger(b)){
            next = Integer.parseInt(b)+2;
        }
        else if(isInteger(c)){
            next = Integer.parseInt(c)+1;
        }

        if(next%3==0 && next%5==0){
            bw.write("FizzBuzz");
        }
        else if(next % 3 == 0){
            bw.write("Fizz");
        }
        else if(next % 5 == 0){
            bw.write("Buzz");
        }
        else bw.write(next + "\n");

        br.close();
        bw.close();
    }

    private static boolean isInteger(String a) {
        try{
            Integer.parseInt(a);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }

}
