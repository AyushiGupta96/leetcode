public class perfect_square {
    /**Example 1:

     Input: num = 16
     Output: true
     Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
     Example 2:

     Input: num = 14
     Output: false
     Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.  */
    /**Algorithm

     If num < 2, return True.

     Set the left boundary to 2, and the right boundary to num / 2.

     While left <= right:

     Take x = (left + right) / 2 as a guess. Compute guess_squared = x * x and compare it with num:

     If guess_squared == num, then the perfect square is right here, return True.

     If guess_squared > num, move the right boundary right = x - 1.

     Otherwise, move the left boundary left = x + 1.

     If we're here, the number is not a perfect square. Return False. */
    public boolean isPerfectSquare(int num) {
        if(num<2){
            return true;

        }
        long left =2; long right = num/2; long x; long result;
        while(left<=right){
            x= left +(right - left)/2;
            result = x*x;
            if(result == num){
                return true;
            }
            if(result>num){
                right = x-1;
            }
            else{
                left = x+1;
            }
        }
        return false;
    }
}
