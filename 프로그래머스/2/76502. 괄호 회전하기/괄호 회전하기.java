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
    
    private boolean isCorrect(List<Character> list) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketPairs = Map.of(
            '}', '{',
            ']', '[',
            ')', '('
        );

        for (Character c : list) {
            if (isOpenBracket(c)) {
                stack.push(c);
            } else if (isCloseBracket(c)) {
                if (stack.isEmpty() || stack.peek() != bracketPairs.get(c)) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    private boolean isOpenBracket(char c) {
        return c == '{' || c == '[' || c == '(';
    }

    private boolean isCloseBracket(char c) {
        return c == '}' || c == ']' || c == ')';
    }
}