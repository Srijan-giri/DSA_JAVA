package com.tut.array_java;

import java.util.Arrays;
import java.util.List;

public class KthSmallestElement1 {
    public static void KthSmallestElement(Integer[]a, int k){

        List<Integer> list=Arrays.asList(a);

        Arrays.sort(a);

        System.out.println(list.get(k-1));
    }

    public static void main(String[] args) {
//        Integer[]arr = {1,1,1,1,2,2,3,3,4,5,5,6,7};
        Integer[]arr={3,-2,4,7,8};
        KthSmallestElement(arr,3);

    }
}
