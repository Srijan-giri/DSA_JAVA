package com.tut.array_java;

import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]arr = new int[100];
        int i=0,j=0,n,ele,pos;
        System.out.println("Enter the length of the array");
        n = input.nextInt();

        System.out.println("Enter the number of elements");
        for(i=0; i<n; i++){
            System.out.printf("arr[%d] :",i);
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the element :");
        ele = input.nextInt();

        for(i=0; i<n; i++){
            if(arr[i]==ele){
                break;
            }
        }

        for(j=i;j<n-1;j++){
            arr[j]=arr[j+1];
        }

        for(i=0;i<n-1;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
