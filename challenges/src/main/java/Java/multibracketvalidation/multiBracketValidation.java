package Java.multibracketvalidation;

import Java.stacksandqueues.Stacks;

import java.util.Stack;

public class multiBracketValidation {

    static boolean pairsAreMatching(char uno, char dos) {
        if (uno == '(' && dos == ')')
            return true;
        else if (uno == '{' && dos == '}')
            return true;
        else if (uno == '[' && dos == ']')
            return true;
        else
            return false;
    }

    public static boolean multiBracketValidation(String input) {
        Stack<Character> bracketValidator = new Stack();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '[')
                bracketValidator.push(input.charAt(i));
            else if (input.charAt(i) == '}' || input.charAt(i) == ')' || input.charAt(i) == ']') {
                if (!pairsAreMatching(bracketValidator.pop(), input.charAt(i))) {
                    return false;
                }
            }
        }
        if (bracketValidator.empty()) {
            return true;
        } return true;
    }
}

