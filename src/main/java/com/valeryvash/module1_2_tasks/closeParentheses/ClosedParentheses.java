package main.java.com.valeryvash.module1_2_tasks.closeParentheses;

import java.util.Stack;

public class ClosedParentheses {

    /*
        The method counts all parentheses.
        It doesn't consider such strings as "({)}" and returns true instead of false.
     */
    static boolean allParenthesesAreClosed(String string) {
        boolean ret_val = false;

            int round = 0, square = 0, shape = 0;

            for (int i = 0; i < string.length(); i++) {

                char temp = string.charAt(i);

                if (temp == '(') round++;
                else if (temp == ')') round--;
                else if (temp == '[') square++;
                else if (temp == ']') square--;
                else if (temp == '{') shape++;
                else if (temp == '}') shape--;

                if (round < 0 || square < 0 || shape < 0) break;
            }

        if (round == 0 && square == 0 && shape == 0) ret_val = true;

        return ret_val;
    }


    /*
        Returns true if char is left bracket
     */
    private static boolean isLeftBracket(char ch)
    {
        return (ch == '(' || ch == '[' || ch == '{');
    }
    /*
        Returns true if char is right bracket
     */
    private static boolean isRightBracket(char ch) {
        return (ch == ')' || ch == ']' || ch == '}');
    }

    /*
        Returns true if chars are opposite
     */
    private static boolean isOpposite(char left, char right)
    {
        return
                (left == '(' && right == ')') ||
                (left == '[' && right == ']') ||
                (left == '{' && right == '}');
    }
    /*
       Parentheses analysis with Stack usage;
     */
    static boolean allBracketsAreClosed(String string)
    {
        // Return parameter
        boolean ret_val = true;

        // Stack init
        Stack<Character> stack = new Stack<>();

        // Check every symbol in string
        for (int i = 0; i < string.length(); i++) {
            char temp = string.charAt(i);

            // If current char is left bracket
            if (isLeftBracket(temp))
            {
                stack.push(temp); // adding the char to the stack
            }
            else if (isRightBracket(temp)) // if char is right bracket
            {
                // and stack doesn't empty and chars are opposed
                if ((!stack.empty()) && isOpposite(stack.peek(),temp))
                {
                    stack.pop(); // take out the element from the stack
                } else { // in other case method returns false
                    ret_val = false;
                    break;
                }
            }
        }

        // If stack doesn't empty, method returns false
        if (!stack.empty()) ret_val = false;

        return ret_val;
    }
}
