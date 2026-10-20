class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1 , length = nums.length;
        if(length ==1)
            return 1;
            
        for (int i=1 ;i<length ; i++){
            if(nums[i] != nums [i-1]){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
        
    }
}

