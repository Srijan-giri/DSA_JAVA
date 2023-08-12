package com.tut.array_java;

public class SecondSmallestElement3 {
    public static String secondSmallestElement(Integer[] arr){
        int first_min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<first_min)
            {
                second_min=first_min;
                first_min=arr[i];
            }

            else if(arr[i]<second_min && arr[i]!=first_min)
            {
                second_min=arr[i];
            }
        }

        return " First Smallest Element : "+first_min+" Second Smallest Element : "+second_min;
    }
    public static void main(String[] args) {
        Integer[]arr = {10,5,15,21,-3,7};
        String result = secondSmallestElement(arr);
        System.out.println(result);
    }
}
