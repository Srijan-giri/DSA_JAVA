package BasicFunctionAndRecursion;

import java.util.Scanner;

public class DigitFrequency {
	
	static int getDigitFrequency(int n,int num)
	{
		int count=0;
		int temp=n;
		while(temp>0)
		{
			int rem= temp%10;
			if(rem==num)
			{
				count++;
			}
			temp=temp/10;
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = input.nextInt();
        System.out.println("Enter the counting number : ");
        int num=input.nextInt();
        DigitFrequency d = new DigitFrequency();
        int result = d.getDigitFrequency(n, num);
        System.out.println(result);
	}

}
