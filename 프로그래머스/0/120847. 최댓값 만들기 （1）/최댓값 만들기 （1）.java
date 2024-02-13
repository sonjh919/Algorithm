import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class Solution {
    public int solution(int[] numbers) {
        Integer[] integerArray = new Integer[numbers.length];
        for(int i=0;i<numbers.length;i++){
            integerArray[i] = numbers[i];
        }
        List<Integer> list = Arrays.asList(integerArray);
        Collections.sort(list);
        return list.get(list.size()-1) * list.get(list.size()-2);
        
        
    }
}