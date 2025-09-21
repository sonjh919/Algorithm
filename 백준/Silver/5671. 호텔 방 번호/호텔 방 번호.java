import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) { // EOF
            int N = sc.nextInt();
            int M = sc.nextInt(); // N보다 크거나 같고 M보다 작거나 같음
            // 방 개수
            int sum = 0;
            while (N <= M) { // N이 M보다 작거나 같을 때 까지
                String number = Integer.toString(N); // 방 번호를 문자열로
                int score = 0; // 방 번호 중에 같은 번호가 있는지 알려주는 변수
                for (int i = 0; i < number.length() - 1; i++) { // 문자열의 i번째 문자와
                    for (int j = i + 1; j < number.length(); j++) { // 문자열의 j번째 문자가 같은지 비교
                        if (number.charAt(i) == number.charAt(j)) { // 같은것이 있다면
                            score++; // 같은문자가 있으면 score + 1
                            break; // 다음 문자는 비교할 필요가 없으므로 break
                        }
                    }
                }
                if (score == 0) // score 변수가 0 이라면 -> 다 다른 문자이므로
                    sum++; // 사용할 수 있는 방 번호
                N++; // 다음 N
            }
            System.out.println(sum); // 방 개수 출력력
       }
    }
}