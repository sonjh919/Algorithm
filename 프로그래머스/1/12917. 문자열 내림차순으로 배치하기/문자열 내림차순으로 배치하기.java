import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);

        return new StringBuilder(new String(array)).reverse().toString();
    }
}