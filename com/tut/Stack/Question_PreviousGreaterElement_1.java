package com.tut.Stack;

public class Question_PreviousGreaterElement_1 {
    public static void PreviousGreaterElement(int[]arr)
    {
        int size = arr.length;
        for(int i=0;i<size;i++)
        {
            boolean isFlag = false;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[j]>arr[i]){
                    System.out.print(arr[j]+" ");
                    isFlag=true;
                    break;
                }
            }

            if(isFlag==false){
                System.out.print("-");
            }
        }
    }
    public static void main(String[] args) {
        int[]arr =  {30, 50, 20, 15, 25};
        PreviousGreaterElement(arr);
    }
}
