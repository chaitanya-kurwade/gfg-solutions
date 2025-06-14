// User function Template for Java

class Solution {
    int countSubstr(String s, int k) {
        // your code here
        return countAtMostKDistinct(s, k) - countAtMostKDistinct(s, k - 1);
    }
    
    private static int countAtMostKDistinct(String s, int k) {
        int n = s.length();
        if (k == 0) return 0;

        HashMap<Character, Integer> freq = new HashMap<>();
        int left = 0, res = 0;

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            while (freq.size() > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                left++;
            }

            res += right - left + 1;
        }

        return res;
    }

}