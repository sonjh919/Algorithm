import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for(int i=0;i<numbers.length;i++){
            sum += numbers[i];
        }
        return 45-sum;
    }
}