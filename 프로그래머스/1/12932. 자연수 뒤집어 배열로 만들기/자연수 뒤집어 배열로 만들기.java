import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Long> solution(long n) {
        List<Long> a = new ArrayList<>();
        while(true){
            a.add(n%10);
            n /= 10;
            if(n==0){break;}
        }
        return a;
    }
}