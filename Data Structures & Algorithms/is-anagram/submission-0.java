class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars1);
        if (Arrays.equals(chars, chars1)) {
            return true;
        }

        return false;
    }
}
