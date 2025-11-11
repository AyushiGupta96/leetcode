public class Maximum_one {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                // increment count of 1's by one.
                count+=1;
            }
            else{
                //find the maximum till now.
                max = Math.max(max,count);
                //Reset count of 1.
                count =0;
            }
        }
        return Math.max(max,count);
    }
}
