import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;        
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int t:tangerine){
            hm.put(t, hm.getOrDefault(t, 0)+1);
        }
        
        List<Integer> valueList = new ArrayList<>(hm.values());
        Collections.sort(valueList, Collections.reverseOrder());
        
        for(int v:valueList){
            k -= v;
            answer++;
            if(k<=0){
                break;
            }
        }
        
        return answer;
    }
}