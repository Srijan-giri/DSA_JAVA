package com.tut.SearchingAndSorting;

public class LinearSearch {
    public static void linearSearch(int[]arr,int item)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==item)
            {
                System.out.println(item +" is found at "+(i+1) + " no position");
                return;
            }
        }
        System.out.println("Element is not found");
    }
    public static void main(String[] args) {
        int[]arr = {10,5,15,21,-3,7};
        linearSearch(arr,-3);
    }
}
