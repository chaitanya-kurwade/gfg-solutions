class Solution {

    void printNos(int N) {
        // code here
        if(N>0) {
            System.out.print(N + " ");
            N--;
            printNos(N);
        }
    }
}