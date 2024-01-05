class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int count = 0;
        long interval = x;
        for(int i=0;i<n;i++){
            answer[i] = interval;
            interval += x;
        }
        return answer;
    }
}