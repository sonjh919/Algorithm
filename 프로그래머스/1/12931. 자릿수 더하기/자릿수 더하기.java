import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        while(true){
        sum += n%10;
        n /= 10;
            
        if(n==0){
            break;
        }
        }
        
    
        return sum;
    }
}