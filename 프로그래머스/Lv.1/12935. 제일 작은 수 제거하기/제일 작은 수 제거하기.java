import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int[] arr) {
        int index = 0;
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                index = i;
                min = arr[i];
            }
        }
        List<Integer> a = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(i!=index){
                a.add(arr[i]);
            }
        }
        if(a.isEmpty()){a.add(-1);}
        return a;
    }
}