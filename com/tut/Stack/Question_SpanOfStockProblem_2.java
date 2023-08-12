package com.tut.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question_SpanOfStockProblem_2 {

    public static void stockSpan(int[]arr)
    {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(0);
        System.out.println("Span of "+arr[0]+" is "+1);

        for(int i=1;i< arr.length;i++)
        {
            while(stack.isEmpty()==false && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }

            int span = stack.isEmpty()?i+1:i-stack.peek();
            System.out.println("Span of "+arr[i]+" is "+span);
            stack.push(i);
        }


    }
    public static void main(String[] args) {
        int []arr={12,14,15,7,15,17,5,12,10,13,20};
        stockSpan(arr);

        /* Efficient code

        int arr[]=new int[n];
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(0);
        arr[0]=1;

        for(int i=1;i<price.length;i++)
        {
            while(stack.isEmpty()==false && price[stack.peek()]<=price[i]){
                stack.pop();
            }

            int span = stack.isEmpty()?i+1:i-stack.peek();
            arr[i]=span;
            stack.push(i);
        }

        return arr;

         */
    }
}
