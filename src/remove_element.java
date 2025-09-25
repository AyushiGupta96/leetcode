public class remove_element {
    public int removeElement(int[] nums, int val) {
        int ph=0;//writer
        for(int i=0;i<nums.length;i++){ // i is reader
            if(nums[i]==val){
                continue;
            }
            else{
                nums[ph++]= nums[i];
            }
        }
        return ph;
    }
}
