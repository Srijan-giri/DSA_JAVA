package com.tut.array_java;

public class BubbleSort1 {
    public  static void bubbleSort(int[]a)
    {
        // Worst Case scenario
        int i;
        int j;

        for(i=0;i<(a.length-1);i++)// passes
        {
            for(j=0;j<(a.length-i-1);j++)// iteration
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
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
        int[]a={28,6,4,2,24};
        System.out.println("Array :");
        display(a);
        System.out.println();
        System.out.println("Sorted Array :");
        bubbleSort(a);
        display(a);
    }
}
