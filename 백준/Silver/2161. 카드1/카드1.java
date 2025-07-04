import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력값 처리하는 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //결과값 출력하는 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();	//카드 저장 Deque
        //카드 저장!
        for(int i=1;i<=N;i++)
            dq.addLast(i);
        int count = 1;
        //행동 진행!
        while(!dq.isEmpty()){
            if(count % 2 == 1)	//카드 버리기 진행
                bw.write(dq.pollFirst() + " ");		//버린 카드 BufferedWriter 저장
            else{	//카드 옮기기 진행!
                int temp = dq.pollFirst();
                dq.addLast(temp);
            }
            count++;
        }
        bw.flush();		//결과 출력
        bw.close();
        br.close();
    }
}