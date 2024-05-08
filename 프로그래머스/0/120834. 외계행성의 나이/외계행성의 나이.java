class Solution {
    public String solution(int age) {
        String answer = "";
        StringBuilder a = new StringBuilder();

        while(true){
            int tmp = age%10;
            age /= 10;
            a.append((char)(tmp+97));
            if(age==0)break;
        }
        a.reverse();
        answer = a.toString();
        return answer;
    }
}