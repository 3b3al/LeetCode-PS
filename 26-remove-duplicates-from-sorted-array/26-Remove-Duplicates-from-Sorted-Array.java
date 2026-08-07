class Solution {
    public int removeDuplicates(int[] nums) {
     int length = nums.length , count = 1;
     if(length == 1)
        return 1;

    for(int i=1 ; i<length; i++){
        if(nums[i] != nums[i-1]){
            nums[count] = nums[i];
            count++;
            }
    }
     return count;
    }
}

