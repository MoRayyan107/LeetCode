// Time Complexity -> O(n), Space Complexity -> O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        // create a res and maxvalue strating with arr[1]

        int res = nums[0];
        int maxValue = nums[0];

        for (int i = 1; i < nums.length; i++){

            // check for maxValue using Math.max()
            // add the maxValue with nums[i] and compare with nums[i]
            maxValue = Math.max(maxValue+nums[i], nums[i]);

            // check if maxValue is greater or res, to store in res variable
            res = Math.max(maxValue, res);
        }

        return res; // return the result value
    }
}
