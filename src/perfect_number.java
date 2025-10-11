public class perfect_number {
    /** Example 1:

     Input: num = 28
     Output: true
     Explanation: 28 = 1 + 2 + 4 + 7 + 14
     1, 2, 4, 7, and 14 are all divisors of 28.
     Example 2:

     Input: num = 7
     Output: false

     Time complexity : O(n). We iterate over all the numbers lesser than n.

     Space complexity : O(1). Constant extra space is used.*/
    public boolean checkPerfectNumber(int num) {
        if(num<0){
            return false;
        }
        int sum =0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum = sum + i;
                // num=num/10;
            }

        }
        return sum == num;
    }
}
