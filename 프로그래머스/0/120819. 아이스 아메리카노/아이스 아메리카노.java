class Solution {
    public int[] solution(int money) {
        int[] res = {0,0};
        res[0] = money/5500;
        res[1] = money-res[0]*5500;
        return res;
    }
}