class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> search = new HashMap<>();
        int [] result = new int[2];
        int arrayLength = nums.length;
        for (int i =0 ; i < arrayLength ; i++ ){
            if(search.containsKey(target - nums[i])){
                result[0] = search.get(target-nums[i]);
                result[1] = i;
            }
            search.put(nums[i] , i);

        }

        return result;
    }
}

// 2 ,0
// 7,1
// 11,2
// 15,3