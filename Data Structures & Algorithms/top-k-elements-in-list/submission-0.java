class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> pairs = new ArrayList<>(hashMap.entrySet());
        Collections.sort(pairs, (a, b) -> b.getValue() - a.getValue());

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = pairs.get(i);
            result.add(entry.getKey());
        }

        int[] arr = result.stream().mapToInt(i -> i).toArray();

        return arr;
    }
}
