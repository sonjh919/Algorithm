import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] a = {1,2,3,4,5}; //5
        int[] b = {2,1,2,3,2,4,2,5}; //8
        int[] c = {3,3,1,1,2,2,4,4,5,5}; //10
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        
        for(int i=0;i<answers.length;i++){
            int tmp = answers[i];
            if(a[i%5]==tmp)aCount++;
            if(b[i%8]==tmp)bCount++;
            if(c[i%10]==tmp)cCount++;  
        }
        
        if(aCount==bCount && bCount==cCount){
            answer.add(1);
            answer.add(2);
            answer.add(3);
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
        
        if(aCount>=bCount){
            if(aCount>=cCount){
                answer.add(1);
            }
        }
        
        if(bCount>=aCount){
            if(bCount>=cCount){
                answer.add(2);
            }
        }
        
        if(cCount>=aCount){
            if(cCount>=bCount){
                answer.add(3);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}