// User function Template for Java

class Solution {
    public String removeUtil(String s) {
        if (s.length() <= 1) return s;

        String result = removeAdjacents(s);
        return result.equals(s) ? result : removeUtil(result);
    }

    private static String removeAdjacents(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int len = s.length();
        while (i < len) {
            if (i < len - 1 && s.charAt(i) == s.charAt(i + 1)) {
                char dupChar = s.charAt(i);
                while (i < len && s.charAt(i) == dupChar) {
                    i++;
                }
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }

        return sb.toString();
    }
}
