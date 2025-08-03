class Solution {
    public int solution(int n) {
        int temp;
        int sum;
        int count = 0;
        for(int i=1;i<=n;i++){
            temp = i;
            sum = 0;
            
            while(sum < n){
                sum += temp;
                if(sum == n){
                    count++;
                    break;
                }
                
                temp++;
            }
        }
        
        return count;
    }
}