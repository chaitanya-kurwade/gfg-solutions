class Solution {
    public void deleteMid(Stack<Integer> s) {
        int k = s.size() / 2;
        delete(s, k);
    }

    private static void delete(Stack<Integer> s, int k) {
        // Base case: if k == 0
        if (k == 0) {
            s.pop();
            return;
        }

        int temp = s.pop();
        delete(s, k - 1);
        s.push(temp);
    }

}