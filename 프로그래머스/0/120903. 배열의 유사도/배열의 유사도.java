class Solution {
    public int solution(String[] s1, String[] s2) {
        int count = 0;
        for(String s: s1){
            for(String t : s2){
                if(s.equals(t)) count++;   
            }
        }
        return count;
    }
}