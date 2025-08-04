class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        int n,m;
        for(int i=3;i<=Math.sqrt(sum);i++){
            n=i;
            m=sum/i;  
            if(((m-2)*2 + (n-2)*2 + 4) == brown && (n-2)*(m-2) == yellow){
                answer[0] = m;
                answer[1] = n;
                break;
            }
        }
        return answer;
    }
}

/*
1. brown + yellow로 완탐
48
2. 각 수식 만족하는지
(m-2)*2 + (n-2)*2 + 4 = ?
/?
*/