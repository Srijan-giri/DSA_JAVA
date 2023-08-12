package com.tut.SearchingAndSorting;

public class QuickSort {

    public static int partition(int[]a,int low,int high)
    {
        int swapIndex = low-1;
        int pivot = a[high];
        for(int j=low;j<high;j++)
        {
            if(a[j]<pivot)
            {
                swapIndex++;
                // swap
                int temp = a[j];
                 a[j]=a[swapIndex];
                a[swapIndex] = temp;
            }
        }

        int temp = a[swapIndex+1];
        a[swapIndex+1] = pivot;
        pivot = temp;
        return (swapIndex+1);
    }
    public static void quickSort(int[]a,int low,int high)
    {
        if(low<=high)
        {
            int indexPi = partition(a,low,high);

            quickSort(a,low,indexPi-1);// left partition // 10 ,30 , 50,20
            quickSort(a,indexPi+1,high);// right partition
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
        int []arr={70,90,10,30,50,20,60};
        int l=0;
        int h = arr.length-1;

        System.out.println("Before Sorting :");
        display(arr);
        quickSort(arr,l,h);
        System.out.println("\n After Sorting :");
        display(arr);
    }
}
