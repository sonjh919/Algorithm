class Solution {
    public long solution(long n) {
        double temp = Math.sqrt(n);
        
        if(Math.ceil(temp)==temp){
            return (long)Math.pow(temp+1,2);
        }
        else
            return -1;
    }
}