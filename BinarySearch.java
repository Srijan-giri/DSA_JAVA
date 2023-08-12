import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]arr = new int[100];
        int i=0,n,ele,left,right,mid,p=0;
        boolean flag =false;

        System.out.println("Enter the length of the array");
        n = input.nextInt();


        System.out.println("Enter the number of elements");
        for(i=0; i<n; i++){
            System.out.printf("arr[%d] :",i);
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the element :");
        ele = input.nextInt();

        left=arr[0];
        right=arr[n-1];

        while(left<=right){
            mid=(left+right)/2;
            if(ele==arr[mid])
            {
                p=mid;
                flag=true;
                break;
            }
            else if(arr[mid]>ele){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        if(flag==true){
            System.out.println("Element is found at "+(p+1)+" no. position");
        }
        else{
            System.out.println("element is not found");
        }



    }
}
