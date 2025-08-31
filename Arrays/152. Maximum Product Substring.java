// Time Complexity -> O(n), Space Complexity -> maybe O(1)
class Solution {
    public int maxProduct(int[] nums) {
        /* same application of Kadane's Algorithm
        res -> the max product of the subarray
        maxp -> the max productt of a subarray
        minp -> the min product of the subarray
        */
        int res = nums[0];
        int maxp = nums[0];
        int minp = nums[0];

        // since we have a stored nums[0] in those three variables
        // start the itteration from index 1
        for (int i = 1; i < nums.length; i++){
            // temp value to store the old maxp
            int tempMax = maxp;

            // recalculate the max and min for ending i subarray
            // minp is kinda critical since we need to be aware of -ve values in the array
            // two -ve min can also give the max 
            maxp = Math.max(nums[i], Math.max(maxp*nums[i], minp*nums[i])); 

            minp = Math.min(nums[i], Math.min(tempMax*nums[i], minp*nums[i]));

            // check the max between res and maxp
            res = Math.max(maxp,res);
        }

        // return after finding the max product
        return res;
    }
}
