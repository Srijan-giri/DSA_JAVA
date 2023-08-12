package com.tut.array_java;

import java.util.Scanner;

public class AddTwoArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        System.out.println("Enter the length of the first array :");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.println("First array : ");
        for (i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }

        System.out.println("Enter the length of the second array :");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Second array : ");
        for (j = 0; j < a2.length; j++) {
            a2[j] = sc.nextInt();
        }

        int[] sum = new int[n1 > n2 ? n1 : n2];
        int c = 0;

        i = a1.length - 1;
        j = a2.length - 1;
        k = sum.length - 1;

        while (k >= 0) {
            int d = c;

            if (i >= 0) {
                d += a1[i];
            }

            if (j >= 0) {
                d += a2[j];
            }

            c = d / 10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }

        if (c != 0) {
            System.out.println(c);
        }

        for (int val : sum) {
            System.out.println(val);
        }

        sc.close();
    }

}
