class Solution {
    // brute force method
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length; // length of the array
        for (int i = 0; i < len; i++){
            for (int j = i+1; j < len; j++){
                if(nums[i] + nums[j] == target)
                    return new int[] {i,j}; // return the indicies if found
            }
        }
        return new int[] {}; // if not found
    }
}
