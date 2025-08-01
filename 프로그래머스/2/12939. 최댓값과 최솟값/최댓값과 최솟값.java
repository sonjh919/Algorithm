class Solution {
    public String solution(String s) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        String[] strs = s.split(" ");
        
        for(int i=0;i<strs.length;i++){
            min = Math.min(min, Integer.parseInt(strs[i]));
            max = Math.max(max, Integer.parseInt(strs[i]));
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(max);
        
        return sb.toString();
    }
}