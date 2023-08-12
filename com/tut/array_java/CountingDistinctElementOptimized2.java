package com.tut.array_java;

public class CountingDistinctElementOptimized2 {
    public static int countingDistinctElement(int[]a)
    {
        int i,j;
        int len = a.length;
        int count=0;

        // lazy approach
        for(i=0;i<len;i++)
        {
           int flag=0;
            for(j=i+1;j<len;j++)
            {
                if(a[i]==a[j])
                {
                    flag=1;
                    break;
                }
            }

            if(flag==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[]a={5,8,5,7,8,10};
        System.out.println("Count :"+countingDistinctElement(a));

        // T.C=o(n^2)
        //s.c=o(1)

    }
}
