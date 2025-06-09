class Solution {
    public int findTheWinner(int n, int k) {
       int c = 0;
       for(int i = 2; i <= n; i++){
        c = (c + k) % i;
       }
       return c + 1;
    }
}