public class String_to_integer {
    public int myAtoi(String s) {
        
        final int INT_MAX =Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;
        //initialize
        int i=0;
        int n = s.length();
        //skip leading whitespace
        while(i<n&&s.charAt(i)==' '){
            i++;
        }
        if(i==n){
            return 0;
        }
        //checking the sign
        int sign=1;
        if(s.charAt(i) == '+'){
            i++;
        }
        else if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        //read digits and convert
        long res=0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            res = res *10+ digit;
            if(sign* res<=INT_MIN){
                return INT_MIN;
            }
            if(sign*res>=INT_MAX){
                return INT_MAX;
            }
            i++;

        }
        return (int)(res*sign);
    }
}
