package com.tut.recursion_java;

public class firstOccuranceAndLastOccurance {
   public static void firstOccurance(int[]arr, int size, int i, int val){
        if(i==size){
            return;
        }

        if(val==arr[i]){
            System.out.println("firstOccurance at index "+i);
        }

        firstOccurance(arr,size,++i,val);

    }



    public static void main(String[] args) {
        int[]arr = {3,5,7,5,2};
        int len = arr.length;
        firstOccurance(arr,len,0,5);
    }
}
