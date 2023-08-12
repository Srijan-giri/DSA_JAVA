package com.tut.array_java;

public class CountingDistinctElement1 {
    public static int countingDistinctElement(int[]a)
    {
        int i,j;
        int len = a.length;
        int[] visited = new int[len];
        int count=0;

        for(i=0;i<len;i++)
        {
            if(visited[i]==0)
            {
                for(j=i+1;j<len;j++)
                {
                     if(a[i]==a[j])
                     {
                         visited[j]=1;
                     }
                }

                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[]a={5,8,5,7,8,10};
        System.out.println("Count :"+countingDistinctElement(a));

        // T.C=o(n^2)
        //s.c=o(n)

    }
}
