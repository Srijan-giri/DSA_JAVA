package com.tut.Stack;

public class Question_NextGreaterElement_1 {
    public static void nextGreaterElement(int[]arr)
    {
        int size = arr.length;
        for(int i=0;i<size;i++)
        {
            boolean isFlag = false;
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]>arr[i])
                {
                    System.out.print(arr[j]+" ");
                    isFlag = true;
                    break;

                }
            }

            if(isFlag==false)
            {
                System.out.print("-");
            }
        }
    }
    public static void main(String[] args) {
        int[]arr =  {30, 50, 20, 15, 25};
        nextGreaterElement(arr);
    }
}
