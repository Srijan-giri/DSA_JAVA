import java.util.Scanner;

public class MergeOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i,j,k=0;
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

		int[]a3 = new int[100];
		
		for(i=0,j=0;i<a1.length && j<a2.length;) {
			if(a1[i]==a2[j])
			{
				a3[k]=a1[i];
				k++;
				i++;
			}
			else if(a1[i]>a2[j]) {
				a3[k]=a2[j];
				k++;
				j++;
			}
			
			else {
				a3[k]=a1[i];
				k++;
				i++;
			}
		}
		
		
		for(;i<a1.length;i++) {
			a3[k]=a1[i];
			k++;
		}
		
		for(;j<a2.length;j++) {
			a3[k]=a2[j];
			k++;
		}
		
		
		for(i=0;i<k;i++)
		{
			System.out.println(a3[i]);
		}
		
	}

}
