class Solution {
    static final int MOD = 1000000007;

    static long sequence(int n) {
        return helper(n, 1, 1);
    }

    private static long helper(int term, int count, int start) {
        if (count > term) return 0;

        long prod = 1;
        for (int i = 0; i < count; i++) {
            prod = (prod * (start + i)) % MOD;
        }

        return (prod + helper(term, count + 1, start + count)) % MOD;
    }
}
