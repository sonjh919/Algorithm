import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int K = sc.nextInt();

        // 피보나치 수열 생성 (최대 30까지)
        int[] fib = new int[31];
        fib[1] = 1;
        fib[2] = 1;
        for (int i = 3; i <= D; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // 완전 탐색으로 A, B 찾기
        for (int A = 1; A <= K; A++) {
            // 식: fib[D-2] * A + fib[D-1] * B = K
            int remainder = K - fib[D - 2] * A;
            if (remainder > 0 && remainder % fib[D - 1] == 0) {
                int B = remainder / fib[D - 1];
                if (B >= A) { // 문제 조건: B는 A 이상일 수 있음 (필요하면 조건 수정)
                    System.out.println(A);
                    System.out.println(B);
                    break;
                }
            }
        }
        sc.close();
    }
}