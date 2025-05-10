class Solution {
    public void moveZeroes(int[] nums) {
        int ind2 = 0;
        for(int ind1 = 0; ind1 < nums.length; ind1++) {
            if(nums[ind1] != 0) {
                nums[ind2] = nums[ind1];
                ind2++;
            }
        }
        while(ind2 < nums.length) {
            nums[ind2] = 0;
            ind2++;
        }
    }
}
