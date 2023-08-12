package com.tut.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question_PreviousGreaterElement_2 {
    public static void PreviousGreaterElement(int[]arr)
    {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(arr[0]);
        System.out.print("-");
        for(int i=1;i<arr.length;i++)
        {
            while(stack.isEmpty()==false && stack.peek()<=arr[i])
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                System.out.print("-");
            }
            else{
                System.out.print(stack.peek()+" ");
            }
            stack.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[]arr =  {30, 50, 20, 15, 25};
        PreviousGreaterElement(arr);
    }
}
