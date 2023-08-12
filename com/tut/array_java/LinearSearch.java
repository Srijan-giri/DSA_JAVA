package com.tut.array_java;

public class LinearSearch {
    public static void linearSearch(char []arr,char item){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==item)
            {
                System.out.println(item+" is found at "+(i+1)+" no index");
                return;  // for 1st case return -> yes
//                return; // for 2nd case return -> X
            }
        }
        System.out.println("Element is not found");
    }

    public static void main(String[] args) {
        // 1st case
        int[]arr = {10,5,15,21,-3,7};
        // 2nd Case
//        int[]arr = {10,5,15,21,-3,7,21,7,10}; // iteration can not go to after 21 element found so second 21 cannot found in array
//        linearSearch(arr,21);


        // for character
        char[]a={'a','b','c','d','e'};
        linearSearch(a,'c');
    }
}
