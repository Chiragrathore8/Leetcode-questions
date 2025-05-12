class Solution {
    public int climbStairs(int n) {
        if(n <= 1){
            return n;
        }
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; i++){
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
}