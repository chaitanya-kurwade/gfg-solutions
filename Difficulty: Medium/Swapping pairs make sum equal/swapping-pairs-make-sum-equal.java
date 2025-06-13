// User function Template for Java

class Solution {
    boolean findSwapValues(int[] a, int[] b) {
        // Your code goes here
        int sumA = 0, sumB = 0;
        for (int num : a) sumA += num;
        for (int num : b) sumB += num;

        int diff = sumB - sumA;
        if (diff % 2 != 0) return false;

        int target = diff / 2;

        Set<Integer> setB = new HashSet<>();
        for (int num : b) setB.add(num);

        for (int numA : a) {
            int numB = numA + target;
            if (setB.contains(numB)) return true;
        }

        return false;
    }
}
