package com.tut.array_java;

import java.util.Arrays;
import java.util.List;

public class KthSmallestElement2 {
    public static void KthSmallestElement(Integer[]a, int k){
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
           k--;
           if(k==0){
               break;
           }
        }
        System.out.println(a[i]);


    }
    public static void main(String[] args) {
        Integer[]arr = {1,1,1,1,2,2,3,3,4,5,5,6,7};
        KthSmallestElement(arr,3);
    }
}
