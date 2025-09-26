public class remove_duplicate_from_sorted_list {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count =1;
        if(n==0){
            return 0;
        }
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
