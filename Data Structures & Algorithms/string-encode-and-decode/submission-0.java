class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) {
            return "";
        }

        StringBuilder encoded = new StringBuilder();

        for (String s : strs) {
            int length = s.length();
            encoded.append(length).append('#').append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();

        int pointer = 0;

        while (pointer < str.length()) {
            int index = str.indexOf('#', pointer);
            int length = Integer.parseInt(str.substring(pointer, index));
            String result = str.substring(index + 1, (index + 1) + length);
            list.add(result);
            pointer = index + 1 + length;
        }

        return list;
    }
}
