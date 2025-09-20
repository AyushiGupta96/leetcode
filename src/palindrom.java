public class palindrom {

        public boolean isPalindrome(int x) {
            int reverse = 0;
            int xcopy=x;
            while(x>0){
                reverse = (reverse* 10)+(x%10);
                //reverse= x%10;
                x/=10;
            }
            return reverse == xcopy;
        }

}
