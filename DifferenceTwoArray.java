import java.util.Scanner;

public class DifferenceTwoArray {
public static void main(String[] args) {
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

	int[]diff =new int[n2];
	int c=0;
	
	i=a1.length-1;
	j=a2.length-1;
	k=diff.length-1;
	
	while(k>=0)
	{
		int d =0;
		int avl = i>=0?a1[i]:0;
		if(a2[j]+c>=avl) {
			d=a2[j]+c-avl;
			c=0;
		}
		
		else {
			d=a2[j]+c+10-avl;
			c=-1;
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
