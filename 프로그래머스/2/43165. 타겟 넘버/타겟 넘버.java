class Solution {
    private int answer = 0;

    public int solution(int[] numbers, int target) {
        Index index = new Index(0);
        dfs(numbers, target, index, 0);
        return answer;
    }

    private void dfs(int[] numbers, int target, Index index, int sum) {
        if (index.getX() == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        dfs(numbers, target, new Index(index.getX() + 1), sum + numbers[index.getX()]);

        dfs(numbers, target, new Index(index.getX() + 1), sum - numbers[index.getX()]);
    }
}

class Index {
    private int x;

    public Index(int x) {
        this.x = x;
    }
    
    public int getX() {
        return x;
    }
}