class Solution {
    public int solution(int[] array, int n) {
        int count = 0;
        for(int a:array){
            if(a==n)count++;
        }
        return count;
    }
}