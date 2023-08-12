import java.util.Scanner;

public class SubsetOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int i,j,k;
		System.out.println("Enter the length of the array :");
		int n = sc.nextInt();
		int[]a = new int[n];
		System.out.println(" array : ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int limit = (int)Math.pow(2,a.length);
		for(i=0;i<limit;i++)
		{
			String set="";
			int temp=i;
			for(j=a.length-1;j>=0;j--)
			{
				int r =temp%2;
				temp=temp/2;
				
				if(r==0)
				{
					set="-\t"+set;
				}
				else
				{
					set=a[j]+"\t"+set;
				}
			}
			
			System.out.println(set);
			
		}

	}

}
