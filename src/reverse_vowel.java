public class reverse_vowel {
    public boolean isVowel(char c){
        return c=='a' || c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='I'||c=='E'||c=='O'||c=='U';
    }
    public void swap(char[] sChar,int i,int j){
        char t=sChar[i];
        sChar[i]=sChar[j];
        sChar[j]=t;
    }
    public String reverseVowels(String s) {
        char[] sChar = s.toCharArray();
        int n= sChar.length;
        int l=0;
        int  r=n-1;
        while(l<r){
            while(l<n && !isVowel(sChar[l])){
                l++;
            }
            while(r>=0 && !isVowel(sChar[r])){
                r--;
            }
            if(l>=r){
                break;
            }
            swap(sChar,l,r);
            l++;r--;
        }
        return new String(sChar);
    }
}
