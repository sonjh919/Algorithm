import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static Integer[] score;
    static Integer[] stair;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input
        int count = Integer.parseInt(br.readLine());
        stair = new Integer[count + 1];
        score = new Integer[count + 1];

        for (int i = 1; i <= count; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        stair[0] = 0;
        score[0] = stair[0];
        score[1] = stair[1];

        if(count>=2){
            score[2] = stair[1] + stair[2];
        }

        bw.write(findScore(count) + "");


        // output
        br.close();
        bw.close();
    }

    private static int findScore(int n) {
        if(score[n] == null){
            score[n] = Math.max(findScore(n-2), findScore(n-3)+stair[n-1]) + stair[n];
        }
        return score[n];
    }

}
