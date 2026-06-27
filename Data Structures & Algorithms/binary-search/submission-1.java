class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = nums[mid];

            if (guess < target) {
                low = mid + 1;
            } else if (guess > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
