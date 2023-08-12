package com.tut.array_java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class SecondSmallestElement1 {
    public static String secondSmallestElement(Integer[] arr){
        // transfer into list
        List<Integer> list = Arrays.asList(arr);

        // collection framework
        Collections.sort(list); // asending order

        int secondmin=list.get(1);
        int secondmax = list.get(list.size()-2);

        return "second min element : "+secondmin+" second max element : "+secondmax;

    }
    public static void main(String[] args) {
        Integer[]arr = {10,5,15,21,-3,7};
        String result = secondSmallestElement(arr);
        System.out.println(result);
    }
}
