public class valid_palindrom {
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int left = 0;
        int right = chars.length-1;
        while(left<right){
            char c1 = chars[left];
            char c2 = chars[right];
            if(!((c1>='a' && c1<='z')||(c1>='0' && c1<='9'))){
                left++;
                continue;
            }
            if(!((c2>='a' && c2<='z')||(c2>='0' && c2<='9'))){
                right--;
                continue;
            }
            if(c1!=c2){
                return false;
            }
            left++;right--;
        }
        return true;
    }
}
