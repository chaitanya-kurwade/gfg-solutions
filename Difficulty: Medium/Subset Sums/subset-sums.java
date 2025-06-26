// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(0, 0, arr, result);
        return result;
    }

    private void helper(int index, int currentSum, int[] arr, ArrayList<Integer> result) {
        if (index == arr.length) {
            result.add(currentSum);
            return;
        }
        helper(index + 1, currentSum + arr[index], arr, result);
        helper(index + 1, currentSum, arr, result);
    }

}