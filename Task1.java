class StringReverse {
    private int index = 0;
    
    public static String reverseStringBetweenParentheses(String s) {
    
        StringBuilder ans = new StringBuilder();
        while (index < s.length()) {
            if (s.charAt(index) == '(') {
                ++index;
                ans.append(reverseStringBetweenParentheses(s));
            } else if (s.charAt(index) == ')') {
                index++;
                return ans.reverse().toString();
            } else {
                ans.append(s.charAt(index++));
            }
        }
        return ans.toString();
    }
}