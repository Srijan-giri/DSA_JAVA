package com.tut.array_java;

public class SmallestElementInArray1 {
    public static String smallestElement(int[]arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
          if(arr[i]<min){
              min=arr[i];
          }

          if(arr[i]>max){
              max=arr[i];
          }
        }

        return "min element : "+min+" max element : "+max;
    }

    public static void main(String[] args) {
        int[]arr = {10,5,15,21,-3,7};
        String result =smallestElement(arr);
        System.out.println(result);
    }
}
