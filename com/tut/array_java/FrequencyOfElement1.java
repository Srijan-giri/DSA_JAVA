package com.tut.array_java;

public class FrequencyOfElement1 {
    public static void FrequencyCount(int[]a){
        int i,j;
        int[]visited=new int[a.length];

        for(i=0;i<a.length;i++){
            if(visited[i]==0){
                int count=1;
                for(j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                        count++;
                        visited[j]=1;
                    }
                }
                System.out.println(a[i]+" : "+count);
            }
        }
    }
    public static void main(String[] args) {
        int[]a={5,8,5,7,8,10};
        FrequencyCount(a);
    }
}
