package com.tut.Stack;

import java.util.ArrayDeque;

public class StackImpl4 {
    public static void main(String[] args) {
        // using Array Deque
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // add the item
        stack.add(5);
        stack.add(10);
        stack.add(15);
        stack.add(20);

        // Iteration
        for(Integer integer:stack){
            System.out.println(integer);
        }



        // pop,peek and size
        System.out.println("Top: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.peek());
        System.out.println("Size: " + stack.size());

        // after that
        for(Integer integer:stack){
            System.out.println(integer);
        }

        System.out.println();
        System.out.println(stack.contains(10));// true
        System.out.println(stack.contains(20));// true

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.isEmpty());



    }
}
