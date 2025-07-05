import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        String[] s = br.readLine().split(" ");

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(arr);

        int startPoint = 0;
        int endPoint = n-1;

        int min = Integer.MAX_VALUE;
        int answer1 = startPoint;
        int answer2 = endPoint;

        while(startPoint < endPoint){
            int sum = arr[startPoint] + arr[endPoint];
            if(Math.abs(min) > Math.abs(sum)){
                min = Math.abs(sum);

                answer1 = startPoint;
                answer2 = endPoint;

                if(sum==0){
                    break;
                }
            }

            if(sum < 0) startPoint++;
            else endPoint--;

        }

        bw.write(arr[answer1] + " " + arr[answer2]);

        br.close();
        bw.close();
    }

}

