class Solution {
    public int solution(String my_string) {
        int sum = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i)<65)
                sum += Integer.parseInt(String.valueOf(my_string.charAt(i)));
        }
        return sum;
    }
}