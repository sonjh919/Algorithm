import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int X = 0;
        
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            int absoluteValue = 0 ;
            if((P-X) < 0){
                absoluteValue = (P-X)*-1;
            }else{
               absoluteValue = (P-X); 
            } 

            if(absoluteValue <= C){
                X++;
            }
            
        }

        System.out.println(X);
    }
}