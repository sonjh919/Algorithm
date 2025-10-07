import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String S = br.readLine(); // 주어진 문자열
        int N = Integer.parseInt(br.readLine()); //질문의 수

        int[][] alpha = new int[S.length()+1][26]; //[주어진 문자열의 인덱스][해당 알파벳의 인덱스]

        //나머지 문자 탐색
        for(int i = 1;i<= S.length();i++) {
            //탐색 중인 문자
            int searchChar = S.charAt(i-1)-'a';

            //알파벳 a부터 z까지 반복
            for(int j = 0; j < 26; j++) {
                //현재 탐색중인 문자보다 한단계 앞인 문자의 값(=이전 값)
                int beforeValue = alpha[i-1][j];
                //알파벳과 탐색 중인 문자가 같으면 이전값 + 1,다르면 이전값으로 넣음
                alpha[i][j] = ( j == searchChar ? beforeValue+1 : beforeValue);
            }
        }

        while(N --> 0){
            st = new StringTokenizer(br.readLine());

            int findIdx = st.nextToken().charAt(0)-'a'; //찾으려는 문자의 인덱스
            int start = Integer.parseInt(st.nextToken())+1; //시작점
            int end = Integer.parseInt(st.nextToken())+1; //끝점

            //가장 끝점의 누적합 - 찾으려는 범위의
            bw.write((alpha[end][findIdx]-alpha[start-1][findIdx])+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}