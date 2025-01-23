import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayDeque<Integer> day = new ArrayDeque<>();
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0;i<progresses.length;i++){
            int dayForFunction = (100 - progresses[i])/speeds[i];
            if((100 - progresses[i])%speeds[i]>0)dayForFunction++;
            
            System.out.println(dayForFunction);
            day.add(dayForFunction);
        }
       
        int count = 0;
        while(!day.isEmpty()){
            int tmp = day.poll();
            count = 1;
            
            while(!day.isEmpty() && tmp >= day.peek()){
                tmp = Math.max(tmp, day.poll());
                count++;
            }
            
            answer.add(count);
        }
        
        return answer.stream().mapToInt(Integer::intValue)
            .toArray();  
    }
}