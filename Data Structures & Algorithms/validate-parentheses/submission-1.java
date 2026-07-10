class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<Character>();

        for (char c : s.toCharArray()) {
            // push all opening brackets to the stack
            if (c == '(' || c == '{' || c == '[') {
                // push
                stack.add(c);
            } else {

                if (stack.isEmpty()) return false;

                // peek last element, if it's an equal opening bracket
                char lastOpening = stack.get(stack.size() - 1);
                char closing = c;
                if (lastOpening == '(' && closing != ')') {
                    // return true; --> don't return true yet, add to stack
                    return false;
                } else if (lastOpening == '{' && closing != '}')  {
                    return false;
                } else if (lastOpening == '[' && closing != ']')  {
                    return false;
                }
                // remove last
                stack.remove(stack.size() - 1);
            }
        }
        //after processing all characters, it's true is the stack is empty
        return stack.isEmpty();
    }
}
