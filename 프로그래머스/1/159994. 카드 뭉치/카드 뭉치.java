import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        ArrayDeque<String> card1 = new ArrayDeque<>(Arrays.asList(cards1));
        ArrayDeque<String> card2 = new ArrayDeque<>(Arrays.asList(cards2));
        String flag = "Yes";
        
        for(int i=0;i<goal.length;i++){
            if(goal[i].equals(card1.peek()))card1.poll();
            else if(goal[i].equals(card2.peek()))card2.poll();
            else{
                flag = "No";
                break;
            }
        }
        
        return flag;
    }
}