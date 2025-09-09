import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

/*
시간제한 2초: 최대 계산 횟수는 2억번
음 어떻게 계산해야하지
*/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        int questionIdx = -1; // "?" 위치
        Set<String> usedWords = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            words[i] = word;
            if (word.equals("?")) {
                questionIdx = i;
            } else {
                usedWords.add(word);
            }
        }

        int m = Integer.parseInt(br.readLine());

        char startChar = '1'; // "?" 앞 단어 끝 글자
        char endChar = '1';   // "?" 뒤 단어 첫 글자

        if (questionIdx > 0) {
            startChar = words[questionIdx - 1].charAt(words[questionIdx - 1].length() - 1);
        }

        if (questionIdx < n - 1) {
            endChar = words[questionIdx + 1].charAt(0);
        }

        for (int i = 0; i < m; i++) {
            String candidate = br.readLine();

            if (usedWords.contains(candidate)) continue; // 이미 나온 단어면 패스

            boolean validStart = (startChar == '1') || (candidate.charAt(0) == startChar);
            boolean validEnd = (endChar == '1') || (candidate.charAt(candidate.length() - 1) == endChar);

            if (validStart && validEnd) {
                bw.write(candidate);
                break;
            }
        }

        // close
        bw.flush();
        bw.close();
        br.close();
    }
}
