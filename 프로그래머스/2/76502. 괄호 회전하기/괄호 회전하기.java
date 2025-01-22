import java.util.*;
class Solution {
    public int solution(String s) {
        List<Character> list = new ArrayList<>();
        int count = 0;
        
        for(char c : s.toCharArray()){
            list.add(c);
        }
        
        for(int i=0;i<list.size();i++){
            if(isCorrect(list))count++;
            Collections.rotate(list,-1);
        }
        
        return count;
    }
    
    private boolean isCorrect(List<Character> list){
        Stack<Character> stack = new Stack<>();
        
        for(Character c : list){
            if(c=='{' || c=='[' || c=='(' )stack.push(c);
            else if(c=='}'){
                if(stack.isEmpty())return false;
                else if(stack.peek()=='{')stack.pop();
            }
            else if(c==']'){
                if(stack.isEmpty())return false;
                else if(stack.peek()=='[')stack.pop();
            }
            else if(c==')'){
                if(stack.isEmpty())return false;
                else if(stack.peek()=='(')stack.pop();
            }
        
        }
        
        return stack.isEmpty();
        
    }
}