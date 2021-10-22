package main.java.com.valeryvash.module1_2_tasks.closeParentheses;

import static main.java.com.valeryvash.module1_2_tasks.closeParentheses.ClosedParentheses.*;

public class ClosedParenthesesDemo {
    public static void main(String[] args) {

        String[] examples = {
                "(){}[]",
                "{([])}",
                "((())",
                "((())]",
                "[]{}",
                "}()[]",
                "({)}",
                "",
                "   ",
                "09opkkk"
        };

        for (String temp:
                examples) {
            System.out.println(temp + "\t" + allBracketsAreClosed(temp));
        }
    }
}
