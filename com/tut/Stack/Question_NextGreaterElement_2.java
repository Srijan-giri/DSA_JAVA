package com.tut.Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

public class Question_NextGreaterElement_2 {

    public static ArrayList<Integer> nextGreaterElement(int[]arr)
    {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        stack.push(arr[arr.length-1]);
        list.add(-1);

        for(int i= arr.length-2;i>=0;i--)
        {
            while(stack.isEmpty()==false && stack.peek()<=arr[i])
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
                list.add(-1);
            }
            else {
                list.add(stack.peek());
            }
            stack.push(arr[i]);
        }

        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {30, 50, 20, 15, 25};
        for(int x : nextGreaterElement(arr)){
            System.out.print(x+" ");
        }
    }
}
