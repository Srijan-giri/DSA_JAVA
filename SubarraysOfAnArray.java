import java.util.Scanner;

public class SubarraysOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		char[]c= {'a','b','c','d'};
		int i,j,k;
		System.out.println("Sub Arrays of this array : ");
		for(i=0;i<c.length;i++)
		{
			for(j=i;j<c.length;j++)
			{
				for(k=i;k<=j;k++)
				{
					System.out.print(c[k]+"\t");
				}
				System.out.println();
			}
		}

	}

}
