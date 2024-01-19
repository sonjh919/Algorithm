class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        int index= 0;

        for(int i=0;i<answer.length;i++){
            if(answer[i].equals(" ")){
                index=0;
            }
            else {
                if(index%2==0){
                    answer[i] = answer[i].toUpperCase();
                }
                else{
                    answer[i] = answer[i].toLowerCase();
                }
                index++;
            }

        }

        return String.join("",answer);
    }
}