public class index_of_first_occurrence {
    public int strStr(String haystack, String needle) {
        int m=needle.length();
        int n=haystack.length();
        for(int i=0;i<=n-m;i++){
            for(int j=0;j<m;j++){
                if(needle.charAt(j)!= haystack.charAt(i+j)){
                    break;
                }
                if(j==m-1){
                    return i;
                }
            }
        }
        return -1;
    }
}
