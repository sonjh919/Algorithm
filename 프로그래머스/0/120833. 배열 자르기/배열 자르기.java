import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int[] numbers, int num1, int num2) {
        List<Integer> list = new ArrayList<>();
        for(int i=num1;i<=num2;i++){
            list.add(numbers[i]);
        }
        return list;
    }
}