import java.util.*;
class Solution {
    public List<Integer> solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for(int i: numlist){
            if(i%n ==0)list.add(i);
        }
        return list;
    }
}