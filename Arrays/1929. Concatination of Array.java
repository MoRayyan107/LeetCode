// Time complexity -> O(n), Space complexity -> O(n)
// beats -> 96.16%, runtime -> 1ms
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2]; // Dynamically make a new array with 2x the length

        // example our array is [1,2,3]
        // and new array created 2x the length -> ans = [0,0,0,0,0,0] len = 6
        // i = 0, ans[i] = nums[i] = 1, we copy 1 into ans
        // then ans[i+n] i.e 0+3 = 3, ans[3] = nums[i] = 1, ans = [1,0,0,1,0,0]
        // and this steps continue till end of our nums array
        for (int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
