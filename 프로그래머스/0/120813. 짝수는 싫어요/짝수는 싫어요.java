import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%2==1)list.add(i);
        }
        return list;
    }
}