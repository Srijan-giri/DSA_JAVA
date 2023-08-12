
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;

public class RotateAnArray {

	static void reverse(int[]a,int start,int end)
	{
		int li=start;
		int ri=end;
		
		while(li<ri)
		{
			int temp=a[li];
			a[li]=a[ri];
			a[ri]=temp;
			
			li++;
			ri--;
		}
	}
	static void rotate(int[] a,int k) {
		k=k%a.length;
		if(k<0)
		{
			k=k+a.length;
		}
		
		// whole part reverse
		
		reverse(a,0,a.length-1);
		
		// 1st part reverse
		reverse(a, 0,k-1);
		
		// 2nd part reverse
		reverse(a, k, a.length-1);
		
	}
	
	 public static void display(int[] a){
		    StringBuilder sb = new StringBuilder();

		    for(int val: a){
		      sb.append(val + " ");
		    }
		    System.out.println(sb);
		  }
	public static void main(String[] args)  {
		
		    int []a= {1,2,3,4,5,6,7};
		    int k=4;
		    System.out.println("Old array : ");
		    display(a);
		    rotate(a, k);
		    System.out.println("New Array : ");
		    display(a);
		
	}

}
