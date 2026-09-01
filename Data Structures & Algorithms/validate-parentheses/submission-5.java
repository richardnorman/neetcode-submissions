class Solution {
    public boolean isValid(String s) {
        // You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.
        // The input string s is valid if and only if:
        //      // Every open bracket is closed by the same type of close bracket.
        //      // Open brackets are closed in the correct order.
        //      // Every close bracket has a corresponding open bracket of the same type.
        // Return true if s is a valid string, and false otherwise.
        // ([{}]) -> true
        // ([{()}]) -> true
        // [(]) -> false

        char[] paranthesisCharArray = s.toCharArray();
        Deque <Character> openBracketStack = new ArrayDeque<Character>();
        for (char paranthesis : paranthesisCharArray) {
            // iterate through stack and compare closing bracket to peek of stack as LIFO important for problem statement
            if (!openBracketStack.isEmpty()) {
                if (paranthesis == '}' && openBracketStack.peekFirst() == '{') {
                    openBracketStack.removeFirst();
                    continue;
                }
                else if (paranthesis == ')' && openBracketStack.peekFirst() == '(') {
                    openBracketStack.removeFirst();
                    continue;
                }
                else if (paranthesis == ']' && openBracketStack.peekFirst() == '[') {
                    openBracketStack.removeFirst();
                    continue;
                }
            }

            // if not a closing brack above, char must be opening bracket, so add to stack
            openBracketStack.push(paranthesis);
        }

        // by the end of loop that iterates and removes every corresponding opening bracket per closing bracket
        // if stack size not 0, then string of paranthesis violated 1+ rules given, therefore invalid
        if (openBracketStack.size() > 0)
            return false;
        else return true;
    }
}
