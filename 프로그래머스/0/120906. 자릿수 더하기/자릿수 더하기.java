class Solution {
    public int solution(int n) {
        int sum = 0;
        String a = n+"";
        for (int i = 0; i < a.length(); i++) {
            sum += Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        return sum;
    }
}