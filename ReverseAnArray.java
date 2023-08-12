
public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30,40,50};
		
		int i,j,temp;
		
		i=0;
		j=a.length-1;
		
		while(i<j) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			i++;
			j--;
		}
		
		for(int val:a) {
			System.out.println(val);
		}

	}

}
