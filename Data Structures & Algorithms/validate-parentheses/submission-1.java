class Solution {
    public boolean isValid(String s) {
        Stack<Character> track = new Stack();
        for (int i = 0; i < s.length(); i++) {
            boolean b = s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']';
            if (track.empty()) { // if its empty
                if (b) {
                    return false; //return false if we start at a closing bracket
                }
                track.push(s.charAt(i)); //otherwise add it
            } else if (b) { // and we wanna add a closing bracket
                switch (track.peek()) { // track the current closing element
                    case '(':
                        if (s.charAt(i) != ')') // if the closing bracket doesn't match then return false
                            return false;
                        track.pop(); // we pop the pair out
                        break; // leave the statement
                    case '[':
                        if (s.charAt(i) != ']')
                            return false;
                        track.pop(); // we pop the pair out
                        break;
                    case '{':
                        if (s.charAt(i) != '}')
                            return false;
                        track.pop(); // we pop the pair out
                        break;
                }
            } else { // if we are adding an opening bracket again we just push it
                track.push(s.charAt(i));
            }
        }
        if (track.empty()) {
            return true;
        } else {
            return false;
        }
}
}