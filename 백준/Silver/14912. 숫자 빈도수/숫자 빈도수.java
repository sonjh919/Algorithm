import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int number = Integer.parseInt(input[0]);
        char digit = input[1].charAt(0);

        String s;
        int count = 0;
        for(int i=1; i<=number; i++) {
            s = Integer.toString(i);
            for(int j=0; j<s.length(); j++) {
                if(s.charAt(j)==digit) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }   
}