public class power_of_4 {
    /**
     *
     * Given an integer n, return true if it is a power of four. Otherwise, return false.
     *
     * An integer n is a power of four, if there exists an integer x such that n == 4x.
     *
     *
     *
     * Example 1:
     *
     * Input: n = 16
     * Output: true
     * Example 2:
     *
     * Input: n = 5
     * Output: false
     * Example 3:
     *
     * Input: n = 1
     * Output: true
     * O(1) time and O(1) space solutions only.
     *
     */
    public boolean isPowerOfFour(int n) {
        if(n<0 || n==0){
            return false;
        }

        while(n %4 ==0){
            n=n/4;

        }
        return n==1;
    }
}
