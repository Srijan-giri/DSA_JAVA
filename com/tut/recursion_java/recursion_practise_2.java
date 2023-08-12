package com.tut.recursion_java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class recursion_practise_2 {
    static int maximum(int[]arr,int idx){
//        if(arr.length==0){
//            return 0;
//        }
//
//        if(idx==arr.length-1)
//        {
//            return arr[idx];
//        }

//        Arrays.sort(arr);
//        return arr[arr.length-1];

        // or

//        int max = maximum(arr,idx+1);
//
//        return Math.max(arr[idx],max);

        // or

        if(idx==arr.length-1){
            return arr[idx];
        }
        int max = maximum(arr,idx+1);
        if(max>arr[idx])
        {
            return max;
        }
        else{
            return arr[idx];
        }




    }

    public static void main(String[] args) {
        int[]arr = {3,4,7,2,5};
        int len = arr.length;
        System.out.println(maximum(arr,0));
    }

}
