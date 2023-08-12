package com.tut.recursion_java;

public class printArrayRecursion {
    static void printArray(int[]arr, int size, int i){
        if(i==size){
            return;
        }
        System.out.println(arr[i]+" ");
        printArray(arr, size,++i);
    }

    static void reversePrintArray(int[]arr, int size, int first,int last)
    {
      if (first>=last){
          return;
      }
      int temp;
      temp=arr[first];
      arr[first]=arr[last];
      arr[last]=temp;

      reversePrintArray(arr,size,first+1,last-1);

    }

    public static void main(String[] args) {
        int[]arr = {3,4,7,2,5};
        int len = arr.length;
        printArray(arr,len,0);
        reversePrintArray(arr,len,0,len-1);
        printArray(arr,len,0);
    }
}
