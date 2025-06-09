// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        // Complete the function
        int n = arr.length;

        // counting how many elements are <= k
        int count = 0;
        for (int num : arr) {
            if (num <= k) {
                count++;
            }
        }

        // counting bad elements in the first window of size 'count'
        int bad = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] > k) {
                bad++;
            }
        }

        // sliding the window
        int minSwaps = bad;
        for (int i = 0, j = count; j < n; i++, j++) {
            if (arr[i] > k) {
                bad--;
            }
            if (arr[j] > k) {
                bad++;
            }
            minSwaps = Math.min(minSwaps, bad);
        }

        return minSwaps;
    }
}
