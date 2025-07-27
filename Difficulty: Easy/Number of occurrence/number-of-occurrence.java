class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int l = 0;
        int r = arr.length - 1;
        int count = 0;
        while(l <= r) {
            int mid = l++;
            if(target == arr[mid]) {
                count++;
            }
        }
        return count;
    }
}
