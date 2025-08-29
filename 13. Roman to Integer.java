// approach 1 -> using hashmap
// Time complexity -> O(n), Space complexity O(1)
// beats -> 55.14% and runtime -> 5ms

class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        HashMap<Character, Integer> match = new HashMap<>();
        match.put('I', 1);
        match.put('V', 5);
        match.put('X', 10);
        match.put('L', 50);
        match.put('C', 100);
        match.put('D', 500);
        match.put('M', 1000);

        // get the last index in result 
        int res = match.get(s.charAt(len - 1));

        // start from RIGHT to LEFT 
        for (int i = len - 2; i >= 0; i--) {
            if (match.get(s.charAt(i)) < match.get(s.charAt(i + 1)))
                res -= match.get(s.charAt(i)); // subtract if current < next value
            else
                res += match.get(s.charAt(i)); // add if current >= next value
        }
        return res;

    }
}

// approach 2 -> using switch statements
// Time Complexity -> O(n), Space complexity -> O(1)
// beats -> 100%, runtime -> 2ms
class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int res = 0, nextVal = 0;

        for (int i = len-1; i >= 0; i--){
            int currVal = 0;
            switch (s.charAt(i)){
                case 'I' : currVal = 1; break;
                case 'V' : currVal = 5; break;
                case 'X' : currVal = 10; break;
                case 'L' : currVal = 50; break;
                case 'C' : currVal = 100; break;
                case 'D' : currVal = 500; break;
                case 'M' : currVal = 1000; break;
            }

            // if currVal is less than nextVal then subtract
            // else add the currVal to result
            res += (currVal < nextVal) ? -currVal : currVal;

            // srt the nextVal to currVal to remember in next iteration
            nextVal = currVal;
        }
        return res;
    }
}
