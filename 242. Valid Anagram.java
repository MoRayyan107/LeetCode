// Time complexity -> O(n)
// Space complexity O(n) (or maybe O(1))

// beats -> 77.14% and runtime -> 4ms

class Solution {
    public boolean isAnagram(String s, String t) {

      // if both strings are not equal, theyre not a anagram
        if(s.length() != t.length()){
            return false;
        }

        int[] frequency = new int[26]; // number of alphabetical charecters

        // converts the char into numerical form a = 0, b = 1, c = 2, ...... z = 25
      // then increment the frequency on that index by 1
        for (int i = 0; i < s.length(); i++) frequency[s.charAt(i) - 'a']++;

       // decrements the index value after conversion and checks if the index reached in it -ve value 
      // if reached -ve value, then return false
        for (int i = 0; i < t.length(); i++){
            if(--frequency[t.charAt(i) - 'a'] < 0)
                return false;
        }

        return true;
    }
}
