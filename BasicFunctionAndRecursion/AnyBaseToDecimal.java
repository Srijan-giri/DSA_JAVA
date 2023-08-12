package BasicFunctionAndRecursion;

import java.util.Scanner;

public class AnyBaseToDecimal {

	public static int anyBaseToDecimal(int n,int b)
	{
		int sum=0;
//		int temp=n;
		int p=1;
		while(n>0)
		{
			int rem=n%b;
			sum=sum+(rem*p);
			p=p*8;
			n=n/b;
			
		}
		
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = input.nextInt();
        System.out.println("Enter the base : ");
        int b = input.nextInt();
        int result=anyBaseToDecimal(n, b);
        System.out.println(result);
	}

}
