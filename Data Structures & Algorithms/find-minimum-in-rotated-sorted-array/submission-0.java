class Solution {
    public int findMin(int[] nums) {
        int left = 0; // 0
        int right = nums.length - 1;

        if (nums[left] <= nums[right]) {
            return nums[0];
        }

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[left] < nums[mid]) {
                left = mid;
            } else {
                return nums[right];
            }
        }
        return nums[right];
    }
}
