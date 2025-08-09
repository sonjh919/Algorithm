import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
시간제한 2초: 최대 계산 횟수는 2억번

S = DNA 문자열 길이
P = 부분문자열의 길이

1 <= |P| <= |S| <= 1,000,000,000

시간 복잡도 : O(S-P+1) = O(N)
P=1, S=1,000,000,000일때 O(N)도 안되는데..? 계산이 이거 맞나? O(logN)은 됨.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // input
        st = new StringTokenizer(br.readLine());
        final int S = Integer.parseInt(st.nextToken());
        final int P = Integer.parseInt(st.nextToken()); // sliding window length

        char[] dnaSubString = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        // sliding window with two pointer
        int start = 0;
        int end = start+P-1;
        int answer = 0;

        int countA=0;
        int countC=0;
        int countG=0;
        int countT=0;

        for (int i = start; i <= end; i++) {
            if(dnaSubString[i]=='A')countA++;
            else if(dnaSubString[i]=='C')countC++;
            else if(dnaSubString[i]=='G')countG++;
            else if(dnaSubString[i]=='T')countT++;
        }

        while(end < dnaSubString.length){
            if(countA>=A && countC>=C && countG>=G && countT>=T)answer++;

            if(dnaSubString[start]=='A')countA--;
            else if(dnaSubString[start]=='C')countC--;
            else if(dnaSubString[start]=='G')countG--;
            else if(dnaSubString[start]=='T')countT--;

            start++;
            end++;
            if(end >= dnaSubString.length)break;

            if(dnaSubString[end]=='A')countA++;
            else if(dnaSubString[end]=='C')countC++;
            else if(dnaSubString[end]=='G')countG++;
            else if(dnaSubString[end]=='T')countT++;
        }

        bw.write(answer+"");

        // close
        bw.flush();
        br.close();
        bw.close();
    }
}