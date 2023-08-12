import java.util.Scanner;

public class MinMaxElementDiff {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
      int []number = new int[100];
      int i=0,n;
      System.out.println("Enter the length of the array :");
      n=input.nextInt();
      for(i=0;i<n;i++)
      {
          System.out.printf("%dst number :",i);
          number[i]=input.nextInt();
      }



      int max=number[0];
      int min=number[0];


      for(i=1;i<n;i++)
      {
          if(max<number[i])
          {
              max=number[i];
          }
          if(min>number[i])
          {
              min=number[i];
          }
      }
      
      int difference = max-min;

      System.out.println("Maximum Number = "+max);
      System.out.println("Minimum Number = "+min);
      System.out.println("Difference :"+difference);

    }
}
