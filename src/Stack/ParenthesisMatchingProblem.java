package Stack;

import java.util.ArrayDeque;

public class ParenthesisMatchingProblem {
    static boolean matchingParenthesis(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i<s.length(); i++) {
            char cur = s.charAt(i);
            if(cur == '(' || cur == '{' || cur == '[') {
                stack.push(cur);
                continue;
            }
            if(cur == ')' || cur == '}' || cur == ']') {
                if(stack.isEmpty()) return false;
            }
            char top;
            switch (cur) {
                case ')' -> {
                    top = stack.pop();
                    if (top != '(') return false;
                }
                case '}' -> {
                    top = stack.pop();
                    if (top != '{') return false;
                }
                case ']' -> {
                    top = stack.pop();
                    if (top != '[') return false;
                }
            }
        }
        return stack.isEmpty();
    }



    public static void main(String[] args) {
        String S = "()[]{}()";
        System.out.println(matchingParenthesis(S));
    }
}

