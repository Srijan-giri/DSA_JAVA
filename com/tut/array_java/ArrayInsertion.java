package com.tut.array_java;

import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]arr = new int[100];
        int i=0,n,ele,pos;
        System.out.println("Enter the length of the array");
        n = input.nextInt();

        System.out.println("Enter the number of elements");
        for(i=0; i<n; i++){
            System.out.printf("arr[%d] :",i);
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the element :");
        ele = input.nextInt();

        System.out.println("Enter the position :");
        pos = input.nextInt();

        for(i=n; i>pos-1; i--){
            arr[i]=arr[i-1];

        }

        arr[pos-1]=ele;

        for(i=0;i<n+1;i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
