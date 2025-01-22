import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        
        for(int i=0;i<moves.length;i++){
            for(int j=0;j<board.length;j++){
                int location = moves[i]-1;
                if(board[j][location] !=0 ){
                    if(!stack.isEmpty() && stack.peek()==board[j][location]){
                        stack.pop();
                        count += 2;
                    }
                    else {
                        stack.push(board[j][location]);                    
                    }
                    board[j][location]=0;
                    break;
                }
            }
        }
        
        return count;
    }
}