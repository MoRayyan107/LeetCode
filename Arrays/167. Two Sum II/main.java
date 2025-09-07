class Solution {
    // Key point -> add by 1 in result when returning
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length-1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if (sum == target)
                return new int[] {left+1,right+1}; // indexing is by 1
              
            else if(sum > target)  
                right--; // sum is larger than target, move the right down by one to decrese the sum matching to target
            else 
                left++; // sum is smaller than target, move the left up by one to increase the sum matching to target
        }
        return new int[] {}; // if not found 

    }
}
