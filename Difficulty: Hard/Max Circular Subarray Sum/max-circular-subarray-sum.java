class Solution {
    public int circularSubarraySum(int[] arr) {
        int total = 0;
        int maxSum = arr[0], curMax = 0;
        int minSum = arr[0], curMin = 0;

        for (int num : arr) {
            total += num;

            curMax = Math.max(num, curMax + num);
            maxSum = Math.max(maxSum, curMax);

            curMin = Math.min(num, curMin + num);
            minSum = Math.min(minSum, curMin);
        }

        // If all numbers are negative, return the max element
        if (maxSum < 0) return maxSum;

        // max of non-circular and circular
        return Math.max(maxSum, total - minSum);
    }
}
