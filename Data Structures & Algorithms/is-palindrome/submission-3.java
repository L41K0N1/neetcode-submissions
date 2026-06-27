class Solution {
    public boolean isPalindrome(String s) {

        for (char c : s.toCharArray()) {
            if(Character.isDigit(c))
            return false;
        }

        s = s.toLowerCase();
        s = s.replaceAll("[^A-Za-z]+", "");
        char[] chars = s.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed = reversed + chars[i];
        }

        if (s.equals(reversed)) {
            return true;
        }
        return false;
    }
}
