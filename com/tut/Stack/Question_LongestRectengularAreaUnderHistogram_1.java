package com.tut.Stack;

public class Question_LongestRectengularAreaUnderHistogram {
    public static int maxArea(int[]arr)
    {
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[j]>=arr[i])
                {
                    count++;
                }
                else{
                    break;
                }
            }

            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[j]>=arr[i])
                {
                    count++;
                }
                else{
                    break;
                }
            }

            int temp=arr[i]*count;
            res=Math.max(res,temp);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 4, 1, 5, 7};
        int n = 7;
        System.out.println("Max Area: " + maxArea(arr));
    }
}
