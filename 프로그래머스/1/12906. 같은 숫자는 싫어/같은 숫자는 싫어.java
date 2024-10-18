import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> s = new ArrayDeque<>();
        s.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(s.peek()!=arr[i])s.push(arr[i]);
        }

        int size = s.size();
        int[] answer = new int[size];
        for (int i = size-1; i >=0; i--) {
            answer[i] = s.pop();
        }
        return answer;
    }
}