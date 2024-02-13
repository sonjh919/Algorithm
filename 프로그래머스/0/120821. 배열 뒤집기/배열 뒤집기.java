import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] num_list) {
        Integer[] integerArray = new Integer[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            integerArray[i] = num_list[i];
        }

        List<Integer> list = Arrays.asList(integerArray);
        Collections.reverse(list);
        return list;
    }
}