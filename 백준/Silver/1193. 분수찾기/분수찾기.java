import java.io.*;

public class Main {

    static int X,N=1;

    public static void main(String[] args) throws IOException {
        //given
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //when
        X = Integer.parseInt(br.readLine());

        int i=1;
        while(X>N){
            N = N+i+1;
            i++;
        }

        int A = i, B=1;
        for (int j = 0; j < N-X; j++) {
            A--;
            B++;
        }

        if(i%2==0) bw.write(A + "/" + B);
        else bw.write(B + "/" + A);

        //then
        bw.flush();
        bw.close();
        br.close();
    }

}
