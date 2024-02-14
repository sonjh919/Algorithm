class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(answer < numbers[i]*numbers[j])
                    answer = numbers[i]*numbers[j];
            }
        }
        return answer;
    }
}