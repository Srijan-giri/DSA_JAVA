package com.tut.array_java;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SmallestElementInArray2 {
    public static String smallestElement(Integer[] arr){
        // transfer into list
        List<Integer>list = Arrays.asList(arr);

        // collection framework
        Collections.sort(list); // asending order

        int min=list.get(0);
        int max = list.get(list.size()-1);

        return "min element : "+min+" max element : "+max;

    }


    public static void main(String[] args) {
            Integer[]arr = {10,5,15,21,-3,7};
            String result = smallestElement(arr);
            System.out.println(result);
        }



}
