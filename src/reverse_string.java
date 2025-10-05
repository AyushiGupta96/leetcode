public class reverse_string {
    public void reverseString(char[] s) {
        //time =O(N) , space =O(1)
        int left =0;
        int right=s.length-1;
        while(left<right){
            char temp = s[left];
            s[left++] = s[right];
            s[right--]= temp;
        }
    }
}
