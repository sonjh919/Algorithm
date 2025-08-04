// 10초

import java.util.*;
class Solution {
    public int solution(int n) {
        int count = Integer.bitCount(n);
        while(true){
            n++;
            if(count==Integer.bitCount(n))return n;
        }
    }

}