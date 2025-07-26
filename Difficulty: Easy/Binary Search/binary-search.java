class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int start = 0;
        int end = arr.length - 1;
        int result = -1; 
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(k == arr[mid]) {
                result = mid;
                end = mid - 1;
            }
            else if(k < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}