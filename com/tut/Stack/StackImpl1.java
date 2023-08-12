package com.tut.Stack;

public class StackImpl1 {
    static final int MAX = 10;
    int top;
    int[]arr = new int[MAX];


    StackImpl1(){
        top=-1;
    }

    // push operation
    boolean push(int x){
//        if(top>=MAX-1)
        if(isFull())
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            arr[++top]=x;
            System.out.println(x+" pushed into stack");
            return true;
        }
    }

    // pop operation

    int pop()
    {
//        if(top<0)
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }

        else {
            int x = arr[top--];
            return x;

        }
    }

    // is Empty

    boolean isEmpty(){
        return top==-1;
    }

    // is Full
    boolean isFull(){
        return top==MAX-1;
    }

    // return peek element
    int peek(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x =arr[top];
            return x;
        }
    }

    // return size of stack
    int size(){
        return (top+1);
    }


    public static void main(String[] args) {
        StackImpl1 s = new StackImpl1();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println(s.pop()+" popped from the stack");
        System.out.println(s.size());
        System.out.println(s.peek()+" is the top element");
        System.out.println(s.isEmpty()?"Stack is Empty":"Stack is not Empty");
        System.out.println(s.isFull()?"Stack is Full":"Stack is not Full");
    }
}
