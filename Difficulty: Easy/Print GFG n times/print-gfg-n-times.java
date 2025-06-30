class Solution {

    void printGfg(int N) {
        // code here
        if(N == 0) {
            return;
        }
                
        System.out.print("GFG ");
        N--;
        printGfg(N);
    }
}