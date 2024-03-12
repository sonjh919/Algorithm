import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        HashMap<String, Integer> closet = new HashMap();
        for (int i = 0; i < clothes.length; i++) {
            closet.put(clothes[i][1], closet.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        answer = 1;
        for(int num : closet.values()) { answer *= (num + 1); }
        answer--;
        
        return answer;
    }
}