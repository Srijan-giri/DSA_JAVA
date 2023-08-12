package com.tut.recursion_java;

public class PowerOfANumber_2 {
   static int Power(int x,int n){
        if(n!=0){
            return x*Power(x,n-1);
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(Power(2,3)); //Non-static method 'Power(int, int)' cannot be referenced from a static context
    }
}
