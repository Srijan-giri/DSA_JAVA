package Sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[]arr= {13,46,24,52,20,9};
		int i,j,pos=0;
		int n = arr.length;
		System.out.println("Array : ");
		for(i=0;i<n-1;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		for(i=0;i<n-1;i++)
		{
			pos=i;
			for(j=i+1;j<n;j++)
			{
				if(arr[pos]>arr[j])
				{
					pos=j;
				}
			}
			if(pos!=i)
			{
				int temp = arr[pos];
				arr[pos]=arr[i];
				arr[i]=temp;
			}
		}
		
		System.out.println("\nNew array after swaping : ");
		for(i=0;i<n-1;i++)
		{
			System.out.print(arr[i]+"\t");
		}

	}

}
