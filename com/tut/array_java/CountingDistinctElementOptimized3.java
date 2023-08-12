package com.tut.array_java;

import java.util.Arrays;

public class CountingDistinctElementOptimized3 {
    public static int countingDistinctElement(int[]a)
    {
        int i,j;
        int len = a.length;
        int count=0;

        Arrays.sort(a); // o(nlogn)

        // lazy approach
        // last occurance of an element
        // o(n)
        for(i=0;i<len;i++)
        {
            while(i<len-1 && a[i]==a[i+1])
            {
                i++;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[]a={5,8,5,7,8,10};
        System.out.println("Count :"+countingDistinctElement(a));

        // T.C=o(nlogn)
        //s.c=o(1)

    }
}
