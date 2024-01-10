class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);
        sb.reverse();
        
        for(int i=4;i<sb.length();i++){
            sb.setCharAt(i,'*');
        }
        sb.reverse();
        String answer = sb.toString();
        return answer;
    }
}