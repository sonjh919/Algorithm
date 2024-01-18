import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int n) {
        List<Integer> res = new ArrayList<>();
        int sum = 0;
        while(true){
            res.add(n % 3);
            n /= 3;
            if(n==0)break;
        }
        Collections.reverse(res);

        for(int i=0;i<res.size();i++){
            sum += (int) (Math.pow(3,i)*res.get(i));
        }
        return sum;
    }
}