class Solution {
    public int solution(int n) {
        int sum = 0;
        for(int i=0;i<=n;i+=2){
            sum += i;
        }
        return sum;
    }
}