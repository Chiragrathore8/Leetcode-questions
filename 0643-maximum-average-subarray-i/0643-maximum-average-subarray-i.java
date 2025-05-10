class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if(k > n || k <= 0){
            return 0.0;
        }
        int currentSum = 0;
        for(int i = 0; i < k; i++){
            currentSum += nums[i];
        }
        int maxSum = currentSum;
        for(int i = k; i < n; i++){
            currentSum -= nums[i-k];
            currentSum += nums[i];
            maxSum = Math.max(currentSum,maxSum);
        }
        return (double) maxSum/k;
    }
}