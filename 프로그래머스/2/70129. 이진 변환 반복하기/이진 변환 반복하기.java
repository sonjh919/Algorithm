class Solution {
    public int[] solution(String s) {
        int count = 0;
        int change = 0;
        
        while(s.length()>1) {
            int num = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)=='0') count++;
                else num++;
            }
            
            s = Integer.toBinaryString(num);
            change++;
        }

        return new int[]{change, count};
    }
}