import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<want.length;i++){
            map.put(want[i], number[i]);
        }
        
        HashMap<String, Integer> tmp;
        for(int i=0;i<=discount.length-10;i++){
            tmp = new HashMap<>(map);

            for(int j=i;j<i+10;j++){
                if(tmp.containsKey(discount[j])){
                    tmp.put(discount[j], tmp.get(discount[j])-1);
                }
            }
            
            if(canDiscount(tmp))count++;
        }
        return count;
    }
    
    boolean canDiscount(HashMap<String, Integer> map){
        for(Integer n : map.values()){
            if(n>0)return false;
        }
        return true;
    }
}