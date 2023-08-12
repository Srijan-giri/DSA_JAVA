
public class InverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]arr = {3,4,1,2,0};
		int[]inv = new int[arr.length];
		int i,v;
		for(i=0;i<arr.length;i++) {
			v=arr[i];
			inv[v]=i;
		}
		
		for(int r:inv) {
			System.out.println(r);
		}

	}

}
