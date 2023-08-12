package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {13, 46, 24, 52, 20, 9};
        int i, j;
        int n = arr.length;
        System.out.println("Array : ");
        for (i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + "\t");
        }
        for (i = 0; i < n - 1; i++) {
            for (i = 0; i < n - 1; i++) {
                for (j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        System.out.println("\nNew array after swaping : ");
        for (i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + "\t");
        }

    }

}
