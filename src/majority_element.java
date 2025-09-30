public class majority_element {
    public int majorityElement(int[] nums) {
        int count =0;
        Integer i= null;
        for(int n:nums){
            if(count==0){
                i=n;
            }
            count+=(n==i)?1:-1;
        }
        return i;
    }
}
