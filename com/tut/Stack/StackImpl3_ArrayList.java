package com.tut.Stack;

import java.util.ArrayList;

public class StackImpl3_ArrayList {
    ArrayList<Integer>list = new ArrayList<Integer>();
    void push(int x)
    {
        list.add(x);
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        int res = list.get(list.size()-1);
        list.remove(list.size()-1);
        return res;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        return list.get(list.size()-1);
    }

    int size(){
       return  list.size();
    }

    boolean isEmpty(){
        return list.isEmpty();
    }

    public static void main (String[] args)
    {
        StackImpl3_ArrayList s = new StackImpl3_ArrayList();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty() ? "Stack is Empty" : "Stack is not Empty");
    }

}
