import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // input

        int N = Integer.parseInt(br.readLine());

        boolean[] alphabet;
        int count = 0;

        for(int t=0;t<N;t++){
            alphabet = new boolean[26];
            // 0. 단어 입력
            String s = br.readLine();

            // 1. 그룹 단어 체킹
            char temp = s.charAt(0);
            alphabet[temp-'a'] = true;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)!=temp){// 앞이랑 다르면
                    if(alphabet[s.charAt(i)-'a']) { // 이전에 나왔으면
                        count--;
                        break; // 끝
                    }
                }
                alphabet[temp-'a'] = true; // 아니면 체크
                temp = s.charAt(i);
            }
            count++;

        }

        bw.write(count+"");


        // close
        bw.flush();
        bw.close();
        br.close();
    }
}
