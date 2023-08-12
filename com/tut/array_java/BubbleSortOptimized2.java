package com.tut.array_java;

public class BubbleSortOptimized2 {
    public  static void bubbleSort(int[]a)
    {
        // best case scenario
        int i;
        int j;

        for(i=0;i<(a.length-1);i++)// passes
        {

            boolean swapped = false;
            for(j=0;j<(a.length-i-1);j++)// iteration
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped=true;
                }
            }

            if(swapped==false)
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
//        int[]a={28,6,4,2,24};
        int[]a={1,2,3,4,5};
        System.out.println("Array :");
        display(a);
        System.out.println();
        System.out.println("Sorted Array :");
        bubbleSort(a);
        display(a);
    }

}
