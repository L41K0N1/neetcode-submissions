class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int x = matrix.length;
        int y = matrix[0].length;

        int start = 0;
        int end = (x * y) - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int midX = mid / y;
            int midY = mid % y;

            int guess = matrix[midX][midY];

            if (guess < target) {
                start = mid + 1;
            } else if (guess > target) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
