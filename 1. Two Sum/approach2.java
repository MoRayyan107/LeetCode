// time complexity -> O(n)
// space complexity -> O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
      // using hashmap for iterating in one go
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++){
            // calculate its compliment
            int compliment = target - nums[i];
            if (map.containsKey(compliment)){
                return new int[] {map.get(compliment),i}; // if found return their index
            }
            map.put(nums[i],i);
        }
        // if not found return nothing
        return new int[] {};
    }
}
