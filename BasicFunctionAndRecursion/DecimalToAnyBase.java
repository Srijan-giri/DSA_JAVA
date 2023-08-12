package BasicFunctionAndRecursion;

import java.util.Scanner;

public class DecimalToAnyBase {

	static int getDecimalToBase(int n,int b) {
		int temp=n;
		int sum=0;
		int p=1;
		while(temp>0)
		{
			int rem = temp%b;
			sum=sum+(rem*p);
			p=p*10;
			temp=temp/b;
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
        int result = getDecimalToBase(n, b);
        System.out.println("octal number : "+result);
	}

}
