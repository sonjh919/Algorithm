import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Integer[] integerArray = new Integer[array.length];  
        for (int i = 0; i < array.length; i++) {  
            integerArray[i] = array[i];  
        }  

        List<Integer> list = Arrays.asList(integerArray);  
        Collections.sort(list);
        
        return list.get(list.size()/2);
    }
}