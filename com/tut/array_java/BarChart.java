package com.tut.array_java;

import java.util.Scanner;

public class BarChart {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i,n,floor,max;
	System.out.println("Enter the length of the array : ");
	n=sc.nextInt();
	int[]arr =new int[n];
	for(i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	
	// max 
	max=arr[0];
	for(i=1;i<arr.length;i++)
	{
		if(max<arr[i]) {
			max=arr[i]; // 6
		}
	}
	System.out.println("Max element :"+max+"\n");
	System.out.println("Bar Chart : ");
	for(floor = max ; floor>=1;floor--)
	{
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>=floor) {
				System.out.print("*\t");
			}
			else {
				System.out.print("\t");
			}
		}
		System.out.println();
		
	}
	
}
}
