import java.util.*;
class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        int cnt = 0;
        int sum = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    
        for(int num : enemy){
            answer++;
            pq.offer(num);
            sum += num;
            if(sum > n && cnt < k){
                int temp = pq.poll();
                sum -= temp;
                cnt++;
                continue;
            }
            if(sum > n){
                answer--;
                break;
            }
        }
        return answer;
    }
}