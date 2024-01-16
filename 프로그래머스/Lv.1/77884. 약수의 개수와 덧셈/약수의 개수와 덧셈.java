class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for(int i=left;i<=right;i++){
            if(getCount(i)%2==0){
                sum += i;
            }
            else{
                sum -= i;
            }
        }
        return sum;
    }
    
    public int getCount(int num){
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0)count++;
        }
        return count;
    }
}