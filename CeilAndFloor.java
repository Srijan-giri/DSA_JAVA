import java.util.Scanner;

public class CeilAndFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int data,ceil,floor,i;
		System.out.println("Enter the length of the array :");
		int n = sc.nextInt();
		int[]a = new int[n];
		System.out.println(" array : ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int l=0;
		int h =a.length-1;
		
		floor=0;
		ceil=0;
		
		 data = sc.nextInt();
		
		while(l<=h)
		{
			int mid =(l+h)/2;
			if(a[mid]>data)
			{
				h=mid-1;
				ceil=a[mid];
			}
			else if(a[mid]<data)
			{
				l=mid+1;
				floor=a[mid];
			}
			else {
				ceil=a[mid];
				floor=a[mid];
				break;
				
			}
		}
		
		
		System.out.println("Floor : "+floor);
		System.out.println("Ceil : "+ceil);
		
		
	}

}
