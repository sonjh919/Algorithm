class Solution {
    public int solution(String t, String p) {
        int res = 0;
        int l = p.length();
        for(int i=0;i<t.length()-l+1;i++){
            if(Long.parseLong(t.substring(i,i+l)) <= Long.parseLong(p)){
                res++;
            }
        }
        return res;
    }
}