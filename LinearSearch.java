
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int i = 0, n, ele, pos, p = 0;
        boolean flag = false;
        System.out.println("Enter the length of the array");
        n = sc.nextInt();

        System.out.println("Enter the number of elements");
        for (i = 0; i < n; i++) {
            System.out.printf("arr[%d] :", i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element :");
        ele = sc.nextInt();

        for (i = 0; i < n; i++) {
            if (arr[i] == ele) {
                p = i;
                flag = true;
                break;

            }
        }

        if (flag == true) {
            System.out.println("Element is found at " + (p + 1) + " no. position");
        } else {
            System.out.println("element is not found");
        }

        sc.close();
    }
}
