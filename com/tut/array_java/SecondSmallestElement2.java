package com.tut.array_java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondSmallestElement2 {

        public static String secondSmallestElement(Integer[] arr){


            //min element normally
            int min=arr[0];

            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }

            int second_min = Integer.MAX_VALUE; // infinity

            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]!=min && arr[i]<second_min){
                    second_min=arr[i];
                }
            }

            return "second minimum element"+second_min;


        }

    public static void main(String[] args) {
        Integer[]arr = {10,5,15,21,-3,7};
        String result = secondSmallestElement(arr);
        System.out.println(result);
    }

}
