package BasicFunctionAndRecursion;

import java.util.Scanner;
public class AnyBaseToBaseAddition {
    public static int BaseToBaseAddition(int n1,int n2,int b)
    {
        int c=0;
        int p=1;
        int sum=0;
        while(n1>0 || n2>0 || c>0)
        {
           int d1= n1%10;
           int d2 = n2%10;

           n1=n1/10;
           n2=n2/10;

           int d = d1+d2+c;

            c=d/b;
            d=d%b;

           sum=sum+(p*d);
           p=p*10;

        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int n1 = input.nextInt();
        System.out.println("Enter the second number : ");
        int n2 = input.nextInt();
        System.out.println("Enter the base : ");
        int b = input.nextInt();
        int result=BaseToBaseAddition(n1, n2, b);
        System.out.println("Sum : "+result);
        input.close();
    }
    
}
