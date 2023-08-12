package com.tut.array_java;



public class remove_all_duplicate_Element {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5,5,5};
//          removeDuplicates(arr);
        int[] a = new int[arr.length];
        int i;
        int j=0;

        for(i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                a[j]=arr[i];
            }
        }
        a[j]=arr[arr.length-1];

        for(i=0;i<j+1;i++){
            System.out.println(a[i]+"\t");
        }
    }
}
