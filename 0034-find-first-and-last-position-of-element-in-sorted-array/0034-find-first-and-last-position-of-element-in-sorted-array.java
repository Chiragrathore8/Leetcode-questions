public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }

    private int findFirst(int[] nums, int target) {
        int index = -1;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }

    private int findLast(int[] nums, int target) {
        int index = -1;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        System.out.println(java.util.Arrays.toString(solution.searchRange(nums1, target1)));

        // Example 2
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        System.out.println(java.util.Arrays.toString(solution.searchRange(nums2, target2)));

        // Example 3
        int[] nums3 = {};
        int target3 = 0;
        System.out.println(java.util.Arrays.toString(solution.searchRange(nums3, target3)));
    }
}
