class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int temp = x;
        while(true){
            sum += temp %10;
            temp /= 10;
            if(temp==0){break;}
        }
        if(x%sum==0){return true;}
        return false;
    }
}