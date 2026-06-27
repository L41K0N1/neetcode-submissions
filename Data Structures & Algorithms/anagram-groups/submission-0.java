class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> hashMap = new HashMap<>();

        for (String rawStr : strs) {
            char[] c = rawStr.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if(hashMap.containsKey(key)) {
                List<String> listFromMap = hashMap.get(key);
                listFromMap.add(rawStr);
            } else {
                List<String> value = new ArrayList<>();
                value.add(rawStr);
                hashMap.put(key, value);
            }
        }

        List<List<String>> result = new ArrayList<>(hashMap.values());


        return result;
    }
}
