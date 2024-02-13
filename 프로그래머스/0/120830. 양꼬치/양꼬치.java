class Solution {
    public int solution(int n, int k) {
        int sum = 0;
        sum += n*12000;
        sum += k*2000;
        
        sum -= (n/10)*2000;
        return sum;
    }
}