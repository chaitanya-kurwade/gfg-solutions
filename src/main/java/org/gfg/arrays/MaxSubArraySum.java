package org.gfg.arrays;

public class MaxSubArraySum {
    public int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0], currentMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        MaxSubArraySum kadane = new MaxSubArraySum();
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int result = kadane.maxSubArraySum(arr);
        System.out.println("Maximum subarray sum is: " + result);
    }
}
