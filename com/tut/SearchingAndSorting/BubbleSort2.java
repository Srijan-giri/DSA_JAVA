package com.tut.SearchingAndSorting;

public class BubbleSort2 {
    public static void bubbleSort(int[]a){
        int i,j;
        for(i=0;i<a.length-1;i++)
        {
            boolean isSwapped =false;
            for(j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    isSwapped=true;
                }
            }

            if(isSwapped==false)
            {
                break;
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
        int[]a={2,1,5,3,7,4,6};
        System.out.println("Before Sorting :");
        display(a);
        bubbleSort(a);
        System.out.println("\nAfter Sorting :");
        display(a);
    }
}

// optimized bubble sort algorithm
// best case o(n)
// worst and average case o(n^2)