class Solution {
    public int maxArea(int[] heights) {
        
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (i != j) {
                    int volume = (j - i) * Math.min(heights[i], heights[j]);
                    list.add(volume);
                }
            }
        }

        return Collections.max(list);
    }
}
