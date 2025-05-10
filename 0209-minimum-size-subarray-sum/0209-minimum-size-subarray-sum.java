class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int currsum = 0;
        int minLength = Integer.MAX_VALUE;
        for(int right = 0; right  < nums.length; right++){
            currsum += nums[right];
            while(currsum >= target){
                if(right - left + 1 < minLength){
                    minLength = right - left + 1;
                }
                currsum -= nums[left];
                left++;
            }
        }
        return minLength != Integer.MAX_VALUE ? minLength : 0;
    }
}