public class HappyNumber {
    /**
     Example 1:

     Input: n = 19
     Output: true
     Explanation:
     12 + 92 = 82
     82 + 22 = 68
     62 + 82 = 100
     12 + 02 + 02 = 1
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
