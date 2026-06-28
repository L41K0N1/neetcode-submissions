class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int windowLength = s1.length();

        Map<Character, Integer> hashMap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            hashMap.put(s1.charAt(i), hashMap.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < windowLength; i++) {
            windowMap.put(s2.charAt(i), windowMap.getOrDefault(s2.charAt(i), 0) + 1);
        }
        
        if (hashMap.equals(windowMap)) {
            return true;
        }

        for (int i = 0; i + windowLength < s2.length(); i++) {

            char leftChar = s2.charAt(i);
            char rightChar = s2.charAt(i + windowLength);

            int leftCharValue = windowMap.getOrDefault(leftChar, 0) - 1;
            if (leftCharValue == 0) {
                windowMap.remove(leftChar);
            } else {
                windowMap.put(leftChar, leftCharValue);
            }

            windowMap.put(rightChar, windowMap.getOrDefault(rightChar, 0) + 1);

            if (hashMap.equals(windowMap)) {
                return true;
            }
        }
        
        return false;
    }
}
