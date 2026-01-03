public class ArrayPartition {
    final static int k=10000;
    public int arrayPairSum(int[] nums) {
        //Store the frequency of each element.
        int[] count = new int[2*k+1];
        for(int i : nums){
            // add k to element to offset negative values
            count[i + k]++;
        }
        //Initialize sum to zero
        int max=0;
        boolean even = true;
        for(int i=0;i<=2 * k;i++){
            while(count[i]>0){
                // Add element if it is at even position
                max +=(even ? i - k : 0);
                //flip the value (one to zero or zero to one)
                even = !even;
                //decrement the frequency count
                count[i]--;
            }
        }
        return max;
    }
}
