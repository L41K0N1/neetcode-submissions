class Solution {
    public int[] twoSum(int[] numbers, int target) {

        if(numbers == null || numbers.length == 0) {
            return null;
        }

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 1; j < numbers.length; j++)
            if(numbers[i] + numbers[j] == target) {
                i++;
                j++;
                return new int[] {i,j};
            }
        }

        return null;
    }
}
