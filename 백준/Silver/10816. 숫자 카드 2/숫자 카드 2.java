import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 입력: 숫자 카드의 개수
        int N = Integer.parseInt(br.readLine());
        // 숫자 카드를 저장할 LinkedHashMap
        LinkedHashMap<Integer, Integer> cardMap = new LinkedHashMap<>();

        // 숫자 카드 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int card = Integer.parseInt(st.nextToken());
            cardMap.put(card, cardMap.getOrDefault(card, 0) + 1);
        }

        // 두 번째 입력: 찾아야 하는 숫자의 개수
        int M = Integer.parseInt(br.readLine());
        // 결과를 저장할 StringBuilder
        StringBuilder sb = new StringBuilder();

        // 찾아야 하는 숫자 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int query = Integer.parseInt(st.nextToken());
            // cardMap에서 해당 숫자의 개수를 찾고 결과에 추가
            sb.append(cardMap.getOrDefault(query, 0)).append(" ");
        }

        // 결과 출력
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}
