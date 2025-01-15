import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String N = br.readLine();
            if (Integer.parseInt(N) == 0) {
                break;
            }

            if(isPalindrome(N)){
                bw.write("yes"+"\n");
            }
            else{
                bw.write("no"+"\n");
            }
        }

        br.close();
        bw.close();
    }

    private static boolean isPalindrome(String n) {
        int length = n.length();
        for (int i = 0; i < length/2; i++) {
            if(n.charAt(i)!=n.charAt(length-i-1))return false;
        }
        return true;
    }
}
