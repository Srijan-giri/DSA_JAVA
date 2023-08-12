package com.tut.SearchingAndSorting;

public class InsertionSort {
    public static void insertionSort(int[]a)
    {
        int i,j;
        int n = a.length;
        for(i=1;i<n;i++)
        {
            int temp = a[i];
            j=i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=temp;
        }
    }
    public static void display(int[]a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int [] arr = {8,6,4,20,24,2,10,12};
        System.out.println("Before Sorting :");
        display(arr);
        insertionSort(arr);
        System.out.println("\nAfter Sorting :");
        display(arr);
    }
}
