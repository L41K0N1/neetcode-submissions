class Solution {
    public int maxArea(int[] heights) {

        int maxVolume = 0;

        int left = 0;
        int right = heights.length - 1;

        while (left < right) {

            int currentVolume = (right - left) * Math.min(heights[left], heights[right]);
            maxVolume = Math.max(currentVolume, maxVolume);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }

        }

        return maxVolume;
    }
}
