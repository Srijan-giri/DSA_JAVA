package com.tut.SearchingAndSorting;

public class SelectionSort {
    public static void selectionSort(int[]a)
    {
        int i,j;
        int n =a.length;
        for(i=0;i<n-1;i++)
        {
            int minIndex = i;
            for(j=i+1;j<n;j++)
            {
                if(a[j]<a[minIndex])
                {
                    minIndex=j;
                }
            }

            // swap two values
            if(minIndex!=i)
            {
                int temp = a[i];
                a[i]=a[minIndex];
                a[minIndex]=temp;
            }
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
        int[]a={1,7,9,2,3,0};
        System.out.println("Before Sorting:");
        display(a);
        selectionSort(a);
        System.out.println("\n After Sorting :");
        display(a);
    }
}
