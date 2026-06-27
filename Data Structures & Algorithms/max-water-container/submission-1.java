class Solution {
    public int maxArea(int[] heights) {

        int maxVolume = 0;

        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                int currentVolume = (j - i) * Math.min(heights[i], heights[j]);
                maxVolume =  Math.max(currentVolume, maxVolume);
            }
        }

        return maxVolume;
    }
}
