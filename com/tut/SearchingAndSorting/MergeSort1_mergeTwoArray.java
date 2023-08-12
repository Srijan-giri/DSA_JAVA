package com.tut.SearchingAndSorting;

public class MergeSort1_mergeTwoArray {

    public static void mergeTwoArray(int[]a,int[]b,int n,int m,int[]c) {
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] == b[j]) {
                c[k] = a[i];
                k++;
                i++;
            } else if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        for (; i < n; i++) {
            c[k++] = a[i];
        }
        for (; j < m; j++) {
            c[k++] = b[j];
        }

        System.out.println(k);
    }
    public static void display(int[]a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int[]a={2,7,14,19,20,21,22};
        int[]b={6,9,11,16,20};
        int n = a.length;
        int m = b.length;
        int []c=new int[n+m];
        System.out.println("a array:");
        display(a);
        System.out.println("\n b array:");
        display(b);
        System.out.println("\n After merging two array :");
        mergeTwoArray(a,b,n,m,c);
        for(int i=0;i<(n+m);i++)
        {
            System.out.print(c[i]+"\t");
        }
    }

    }

