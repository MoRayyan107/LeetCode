// Time complexity -> O(n), Spce Complexity -> O(1)
// beats -> 96.6%, runtime -> 2ms

class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenthesisStack = new Stack<>();

        for (char x : s.toCharArray()){
            if (x == '(' || x == '{' || x == '[')
                parenthesisStack.push(x);
            
            else if (x == ')' || x == '}' || x == ']'){
                if (parenthesisStack.isEmpty()) return false;

                char rem = parenthesisStack.pop();
                if ((x == ')' && rem != '(') ||
                    (x == '}' && rem != '{') ||
                    (x == ']' && rem != '['))

                    return false;
            }
        }
        
        return (parenthesisStack.isEmpty()) ? true : false;
    
    }
}
