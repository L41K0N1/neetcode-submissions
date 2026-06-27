class Solution {
    public static int longestConsecutive(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int num = nums[0];
        Set<Integer> set = new HashSet<>();
        set.add(num);

        Map<Integer, Set<Integer>> hashMap = new HashMap<>();
        int sequenceId = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (num + 1 == nums[i]) {
                num = nums[i];
                set.add(num);
            } else {
                hashMap.put(sequenceId, new HashSet<>(set));
                sequenceId++;
                set.clear();
                num = nums[i];
                set.add(num);
            }
        }
        hashMap.put(sequenceId, set);

        hashMap.forEach((key, value) -> System.out.println("Key: " + key + " Values: " + value));

        return hashMap.values()
                .stream()
                .mapToInt(Set::size)
                .max()
                .orElse(0);
    }
}
