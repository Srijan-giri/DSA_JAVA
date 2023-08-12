
import java.util.Scanner;

public class FirstindexAndLastindexInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, low, high;
        System.out.println("Enter the length of the array :");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("array : ");
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int data = sc.nextInt();

        low = 0;
        high = a.length - 1;
        int LastIndex = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] > data) {
                high = mid - 1;
            } else if (a[mid] < data) {
                low = mid + 1;
            } else {
                LastIndex = mid;
                low = mid + 1;

            }
        }

        System.out.println("Last Index :" + LastIndex);

        low = 0;
        high = a.length - 1;
        int FirstIndex = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] > data) {
                high = mid - 1;
            } else if (a[mid] < data) {
                low = mid + 1;
            } else {
                FirstIndex = mid;
                high = mid - 1;

            }
        }

        System.out.println("First Index :" + FirstIndex);

        sc.close();

    }

}
