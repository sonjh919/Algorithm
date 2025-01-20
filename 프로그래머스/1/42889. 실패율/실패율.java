import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        // 도전자 수 분석 : O(N + M)  
        int[] challenger = new int[N+2];
        for(int i=0;i<stages.length;i++){ // M
            challenger[stages[i]]++;
        }
        
        Map<Integer, Double> fail = new HashMap<>();
        double total = stages.length;
        // 실패율 구하기 : O(N)
        for(int i=1;i<=N;i++){
            if(challenger[i]==0)fail.put(i,0.);
            else{
            fail.put(i,challenger[i]/total);
            total -= challenger[i];
            }
        }
        
        // 정렬하기 : O(NlogN)
        return fail.entrySet().stream()
                .sorted(((o1, o2) -> Double.compare(o2.getValue(), o1.getValue())))
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}