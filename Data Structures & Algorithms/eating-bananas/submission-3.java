class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        // int right = piles.length;
        int right = Arrays.stream(piles).max().getAsInt();
        int res = right;

        while (left <= right) {
            int midK = (left + right) / 2;          

            if (eatingTime(piles, midK) <= h) {
                res = midK;
                right = midK - 1;
            } else {
                left = midK + 1;
            }
        }
        return res;
    }

    public int eatingTime(int[] arr, int k) {
        int totalTime = 0;
        for (int pile : arr) {
            totalTime += Math.ceil((double) pile / k);
        }
        return totalTime;
    }
}
