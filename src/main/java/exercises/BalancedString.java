package exercises;

import data_structures.ArrayStack;
import data_structures.Stack;

public class BalancedString {

    static boolean isBalanced(String checkedString) {
        Stack<Character> stack = new ArrayStack<>();
        char[] chars = checkedString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '[' || chars[i] == ']' || chars[i] == '{' || chars[i] == '}'
                    || chars[i] == '(' || chars[i] == ')') {
                if (stack.isEmpty()) {
                    if (!isOpenBracket(chars[i])) {
                        return false;
                    } else {
                        pushBracketOnStack(stack, chars[i]);
                    }

                } else if (chars[i] == Brackets.closeBracket) {
                    stack.pop();
                    if (!stack.isEmpty()) {
                        Brackets.openBracket = stack.peek();
                        Brackets.setCloseBracket();
                    }
                } else if (isOpenBracket(chars[i])) {
                    pushBracketOnStack(stack, chars[i]);
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static void pushBracketOnStack(Stack<Character> stack, char aChar) {
        stack.push(aChar);
        Brackets.openBracket = aChar;
        Brackets.setCloseBracket();
    }

    static boolean isOpenBracket(char bracket) {
        return bracket == '[' || bracket == '{' || bracket == '(';
    }

    static class Brackets {

        private static char openBracket;
        private static char closeBracket;

        public static void setCloseBracket() {
            closeBracket = openBracket == '[' ? ']' : openBracket == '{' ? '}' : ')';
        }
    }
}