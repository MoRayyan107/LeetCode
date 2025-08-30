// Time complexity -> O(n), Space Complexity -> O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        // using two pointers
        int i = 0;
        for (int j = 1; j < nums.length; j++){
            if (nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}
