package main.java.com.valeryvash.javacore.chapter18;

import javax.swing.*;
import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

    static void showpush(Stack<Integer> st, int a) {
        st.push(a);
        System.out.println("push(" + a + ") ");
        System.out.println("stack: " + st);
    }

    static void showpop(Stack<Integer> st) {
        System.out.print("pop->");
        Integer a = st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("stack: " + stack);

        showpush(stack,42);
        showpush(stack,66);
        showpush(stack,99);
        showpop(stack);
        showpop(stack);
        showpop(stack);

        try{
                showpop(stack);
                } catch (EmptyStackException e) {
            System.out.println("stack is empty");
        }
    }
}
