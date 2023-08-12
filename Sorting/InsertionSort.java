package Sorting;

public class InsertionSort {
  public static void main(String[] args) {
	  int[]arr= {71 , 13 , -3 , 4 ,  23 , 101};
		int i,j;
		int n = arr.length;
		System.out.println("Array : ");
		for(i=0;i<n-1;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		
		for(i=1;i<n;i++)
		{
			int temp=arr[i]; // arr[1]=13=arr[i]
			for(j=i-1;j>=0 && arr[j]>temp;j--) // arr[j=0]=71 and arr[j]>tem==71>13
			{
				// shifting
				arr[j+1]=arr[j]; // [arr[j+1]=arr[i]]arr[1] =arr[j]=71
				arr[j]=temp; // arr[0]=13
			}
		}
		
		System.out.println("\nNew array after swaping : ");
		for(i=0;i<n-1;i++)
		{
			System.out.print(arr[i]+"\t");
		}

}
}
