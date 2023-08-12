package com.tut.Stack;

public class StackImpl2 {
    int capacity;
    int top;
    int []arr;

    StackImpl2(int size){
        top=-1;
        capacity = size;
        arr = new int[capacity];
    }

    void push(int x){
        if(top>=capacity-1)
        {
            System.out.println("Stack overflow");
            return;
        }
        else{
            top++;
            arr[top]=x;
        }
    }

    int pop(){
        if(top==-1)
        {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }

        else{
            int x = arr[top];
            top--;
            return x;
        }
    }

    int peek(){
        if(top==-1)
        {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }

        else{
         return arr[top];
        }
    }

    int size(){
        return (top+1);
    }

    boolean isEmpty(){
        return top==-1;
    }

    boolean isFull(){
        return top==capacity-1;
    }

    public static void main(String[] args) {
        StackImpl2 s = new StackImpl2(10);
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty() ? "Stack is Empty" : "Stack is not Empty");
        System.out.println(s.isFull() ? "Stack is Full" : "Stack is not Full");

    }


}
