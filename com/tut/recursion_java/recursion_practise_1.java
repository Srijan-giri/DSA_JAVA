package com.tut.recursion_java;

import java.util.Scanner;

public class recursion_practise_1 {

    static void printpattern(int n){
        if(n==0){
            return;
        }

        System.out.print(n+" ");
        printpattern(n-1);
        System.out.print(n+" ");
        printpattern(n-1);
        System.out.print(n+" ");
        printpattern(n-1);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printpattern(n);
    }

}

//Question :
//        Sample Input 1 —- 1
//        Sample Output 1 —-1 1 1
//
//        Sample Input 2 —- 2
//        Sample Output 2 —- 2 1 1 1 2 1 1 1 2
//
//        Sample Input 2 —- 3
//        Sample Output 3 —- 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
