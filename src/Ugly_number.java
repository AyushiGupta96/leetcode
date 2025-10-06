public class Ugly_number {
    /**
     * An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
     *
     * Given an integer n, return true if n is an ugly number.
     *
     *
     *
     * Example 1:
     *
     * Input: n = 6
     * Output: true
     * Explanation: 6 = 2 × 3
     * Example 2:
     *
     * Input: n = 1
     * Output: true
     * Explanation: 1 has no prime factors.
     * Example 3:
     *
     * Input: n = 14
     * Output: false
     * Explanation: 14 is not ugly since it includes the prime factor 7.
     */
    //keep dividing divident by divisor when division is possible
    private int keepDividingWhenDivisible(int divident , int divisor){
        while(divident% divisor==0){
            divident /=divisor;
        }
        return divident;
    }
    public boolean isUgly(int n) {
        // A non-positive integer connot be ugly
        if(n<=0){
            return false;
        }
        // factorize by diving with permitted factors
        for(int factor : new int[] { 2,3,5 }){
            n= keepDividingWhenDivisible(n ,factor);
        }
        //check if integer is reduced to 1 or not
        return n==1;
    }
}
