class Solution {
    public int solution(int[] array, int height) {
        int count = 0;
        for(int i : array){
            if(i>height)count++;
        }
        
        return count;
    }
}