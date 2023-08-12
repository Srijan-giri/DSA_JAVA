import java.util.Scanner;

public class DifferenceTwoArrayModified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int i,j,k;
		System.out.println("Enter the length of the first array :");
		int n1 = sc.nextInt();
		int[]a1 = new int[n1];
		System.out.println("First array : ");
		for(i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the length of the second array :");
		int n2 = sc.nextInt();
		int[]a2 = new int[n2];
		System.out.println("Second array : ");
		for(j=0;j<a2.length;j++)
		{
			a2[j]=sc.nextInt();
		}

		int[]diff = new int[n1>n2?n1:n2];
		int c=0;
		System.out.println("Length of diff : "+diff.length);
		i=a1.length-1;
		j=a2.length-1;
		k=diff.length-1;
		
		while(k>=0) {
			int d=0;
			int a1vl=i>=0?a1[i]:0;
			int a2vl=j>=0?a2[j]:0;
			
			System.out.println("a1vl :"+a1vl);
			System.out.println("a2vl :"+a2vl);
		
			if(a1vl<a2vl) {
			
			if(a2vl+c>=a1vl) {
				d=a2vl+c-a1vl;
				c=0;
				System.out.println("d1:"+d);
				
				
			}
			
			else {
				d=a2vl+c+10-a1vl;
				c=-1;
				System.out.println("d2:"+d);
			}
			}
			
			else
			{
				if(a1vl+c>=a2vl) {
					d=a1vl+c-a2vl;
					c=0;
					System.out.println("d1:"+d);
					
					
				}
				
				else {
					d=a1vl+c+10-a2vl;
					c=-1;
					System.out.println("d2:"+d);
				}
			}
			
			
			diff[k]=d;
			
			
			
			i--;
			j--;
			k--;
		}
		
		int idx=0;
		
		while(idx<diff.length) {
			if(diff[idx]==0) {
				idx++;
			}
			else {
				break;
			}
		}
		
		while(idx<diff.length) {
			System.out.println(diff[idx]);
			idx++;
		}

	}

}
