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

        // input
        int n = Integer.parseInt(br.readLine());

        String[] tmp = br.readLine().split(" ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tmp[i]);
        }

        Arrays.sort(arr);

        int x = Integer.parseInt(br.readLine());
        int count=0;

        int startPoint = 0;
        int endPoint = n-1;

        int temp = 0;
        while(startPoint < endPoint){
            temp = arr[startPoint] + arr[endPoint];

            if(temp > x){
                endPoint--;
            }

            else if(temp < x){
                startPoint++;
            }

            else{
                startPoint++;
                endPoint--;
                count++;
            }
        }

        bw.write(count+"");
        // output
        br.close();
        bw.close();
    }

}
