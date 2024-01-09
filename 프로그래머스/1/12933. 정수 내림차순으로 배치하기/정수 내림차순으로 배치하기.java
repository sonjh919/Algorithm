import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        List<Long> temp= new ArrayList<>();
        while(true){
            temp.add(n%10);
            n /= 10;
            if(n==0){break;}
        }
        Collections.sort(temp);
        for(int i=0;i<temp.size();i++){
            n += (long) (Math.pow(10,i)*temp.get(i));
        }
        return n;
    }
}