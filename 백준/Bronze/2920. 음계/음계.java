import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        String type = "mixed";

        if (isAscending(input)) {
            type = "ascending";
        } else if (isDescending(input)) {
            type = "descending";
        }

        bw.write(type + "\n");
        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean isDescending(String[] input) {
        for (int i = input.length; i >= 1; i--) {
            if (Integer.parseInt(input[input.length - i]) != i) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAscending(String[] input) {
        for (int i = 1; i < input.length; i++) {
            if (Integer.parseInt(input[i - 1]) != i) {
                return false;
            }
        }
        return true;
    }
}
