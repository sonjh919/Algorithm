import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        List<Integer> A;

        String[] input = br.readLine().split(" ");
        A = Arrays.stream(input)
                .map(Integer::parseInt)
                .collect(toList());

        Collections.sort(A);

        br.readLine();

        input = br.readLine().split(" ");

        for (String s : input) {
            bw.write(checkIsContain(Integer.parseInt(s), A) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static int checkIsContain(int i, List<Integer> A) {
        int tmp = Collections.binarySearch(A, i);
        if(tmp<0)return 0;
        return 1;
    }
}
