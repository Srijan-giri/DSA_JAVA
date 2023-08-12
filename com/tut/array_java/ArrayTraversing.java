package com.tut.array_java;

import java.util.Scanner;

public class ArrayTraversing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]arr = new int[100];
        int i,n;
        System.out.println("Enter the length of the array");
        n = input.nextInt();

        System.out.println("Enter the number of elements");
        for(i=0; i<n; i++){
            System.out.printf("arr[%d] :",i);
            arr[i] = input.nextInt();
        }

        System.out.println("Traversing the array : ");
        for(i=0; i<n; i++){
            System.out.print(arr[i]+"\t");
        }
    }

}
