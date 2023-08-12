package com.tut.Stack;

public class Question_SpanOfStockProblem_1 {

    public static void stockSpan(int[]arr)
    {
        int len =arr.length;
        for(int i=0;i<len;i++)
        {
            int current_span=1;
            for(int j=i-1;j>=0 && arr[j]<=arr[i];j--)
            {
                current_span++;
            }
            System.out.println("Span of "+arr[i]+" is "+current_span);
        }
    }

    public static void main(String[] args) {

        int []arr={12,14,15,7,15,17,5,12,10,13,20};
        stockSpan(arr);
    }
}
