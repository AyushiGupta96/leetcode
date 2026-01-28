public class HappyNumber {
    /**
    Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
     Example 1:

     Input: n = 19
     Output: true
     Explanation:
     1*1 + 9*9 = 82
     8*8 + 2*2 = 68
     6*6 + 8*8 = 100
     1*1 + 0*0 + 0*0 = 1
     Example 2:

     Input: n = 2
     Output: false
     Time complexity : O(logn)
     Space complexity : O(1).
     */
    public int getNext(int n){
        int sum=0;
        while(n>0){
            int m=n%10;
            n=n/10;
            sum = sum + m*m;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int i=n;
        int j=getNext(n);
        while(j!=1 && i!=j){
            i=getNext(i);
            j=getNext(getNext(j));
        }
        return j==1;
    }
}
