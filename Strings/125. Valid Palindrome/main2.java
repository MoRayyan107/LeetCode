// Time Complexity -> O(n), Space Complexity -> O(1)

class Solution {
    public boolean isPalindrome(String s) {
        // alternate way without using replace all
        int left = 0;
        int right = s.length() - 1;

        s = s.toLowerCase();

        if (s.length() <= 1)
            return true;
            
        while(left < right){
            if(!Character.isLetterOrDigit(s.charAt(left)))
                left++;

            else if(!Character.isLetterOrDigit(s.charAt(right)))
                right--;
            
            else if(s.charAt(left) != s.charAt(right))
                return false;
            
            else{
                left++;
                right--;
            }
        }

        return true;
    }
}
