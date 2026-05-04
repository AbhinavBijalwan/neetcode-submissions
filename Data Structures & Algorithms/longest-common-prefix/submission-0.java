class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        int index = 0;

        while (true) {
            char c = 0; // reset for each position

            for (String s : strs) {
                if (index == s.length()) {
                    return strs[0].substring(0, index);
                }

                if (c == 0) {
                    c = s.charAt(index);
                } else if (s.charAt(index) != c) {
                    return strs[0].substring(0, index);
                }
            }

            index++;
        }
    }
}