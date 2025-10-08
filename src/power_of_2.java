public class power_of_2 {
    /**
     Given an integer n, return true if it is a power of two. Otherwise, return false.

     An integer n is a power of two, if there exists an integer x such that n == 2x.



     Example 1:

     Input: n = 1
     Output: true
     Explanation: 20 = 1
     Example 2:

     Input: n = 16
     Output: true
     Explanation: 24 = 16
     Example 3:

     Input: n = 3
     Output: false
     A intuitive way to check the power of two is to check whether we can divide the number repeatedly by 2 until we reach 1. If at any point the number isn't divisible by 2, then it isn't a power of two.

     This solution runs in O(logN) time because we divide the number by 2 at each step, and it takes approximately log
     2
     ​
     (N) divisions before we reach 1 (or realize it's not possible).
     */
    public boolean isPowerOfTwo(int n) {
        if(n<0){
            return false;
        }
        while(n!=0 && n%2==0){
            n=n/2;
        }
        return  n==1;
    }
}
