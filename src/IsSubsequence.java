public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
        int p=0;
        for(int i=0;i<t.length();i++){
            if(p==s.length()){
                return true;
            }
            if(s.charAt(p)==t.charAt(i)){
                p++;
            }
        }
        return p==s.length();
    }
}
