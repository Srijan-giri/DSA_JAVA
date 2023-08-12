package com.tut.Stack;

import java.util.Stack;

public class StackImpl5 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println("Push Item :"+ stack.push(5));
        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println("Top: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.peek());
        System.out.println("Size: " + stack.size());

        // returns the position from the top of the stack where the object is located with base case being 1
        // the return value -1 indicates that the object is not on the stack.

        System.out.println("contains :"+stack.contains(15));
        System.out.println(stack.search(15));//1
        System.out.println(stack.search(10));//2
        System.out.println(stack.search(5));//3
        System.out.println(stack.search(20));//-1

    }
}
