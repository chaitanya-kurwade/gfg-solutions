class Solution {
    public long subarraySum(int[] arr) {
        int n = arr.length;
        long mod = 1_000_000_007;
        long total = 0;

        for (int i = 0; i < n; i++) {
            long contribution = (arr[i] % mod) * (i + 1L) % mod;
            contribution = (contribution * (n - i)) % mod;
            total = (total + contribution) % mod;
        }

        return total;
    }
}
