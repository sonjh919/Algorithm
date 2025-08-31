import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 총 후보 수
        int m = Integer.parseInt(br.readLine()); // 다솜이 득표 수

        int count = 0; // 매수 횟수
        if(n != 1) {
            // 다른 후보의 득표수를 내림차순 하기 위한 우선순위 큐 작성
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
            for(int i=1; i<n; i++)
                priorityQueue.add(Integer.parseInt(br.readLine()));

            // 다른 후보자들의 가장 큰 득표수가 다솜이 표 이상일 때 계속 매수(반복) 진행
            while(priorityQueue.peek() >= m) {
                int peek = priorityQueue.poll(); // 가장 큰 득표수
                peek--;
                m++;
                priorityQueue.add(peek);
                count++;
            }
        }

        System.out.print(count);
    }
}