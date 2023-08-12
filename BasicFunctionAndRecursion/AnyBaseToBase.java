package BasicFunctionAndRecursion;
import java.util.Scanner;
public class AnyBaseToBase {
    public static int anyBaseToDecimal(int n,int b){
        int sum=0;
        int p=1;
        int temp=n;
        while(temp>0)
        {
           int rem = temp%10;
           sum=sum+(rem*p);
           p=p*b;
           temp=temp/10;
        }

        return sum;
    }

    public static int decimalToAnyBase(int n,int b)
    {
        int sum=0;
        int p=1;
        int temp=n;
        while(temp>0)
        {
          int rem = temp%b;
           sum = sum+(rem*p);
           p=p*10;
          temp=temp/b;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = input.nextInt();
        System.out.println("Enter the first base : ");
        int b1 = input.nextInt();
        System.out.println("Enter the second base : ");
        int b2 = input.nextInt();

        int result1=anyBaseToDecimal(n, b1);
        System.out.println("Any Base to decimal : "+result1);

        int result2=decimalToAnyBase(result1, b2);
        System.out.println("Decimal to any base : "+result2);
       
    }
}
