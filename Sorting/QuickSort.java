package Sorting;

public class QuickSort {

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[si]; // bydefault pivot hai
        int count = 0; // kitna element pivot se chota hai usko count karna parega 
        for (int i = si + 1; i <= ei; i++) {
            // jo element pivot se chota hai , usko check karke count barana parega
            if (arr[i] < pivot) {
                count++;
            }
        }

        int pivotIndex = si + count;

        // swap with pivot element and pivot index element
        int temp = pivot;
        pivot = arr[pivotIndex];
        arr[pivotIndex] = temp;

        int i = si, j = ei;
        while (i < pivotIndex && j > pivotIndex) {
            while (i < pivotIndex) {
                i++;
            }
            while (j > pivotIndex) {
                j--;
            }
            // swapping 
            if (i < pivotIndex && j > pivotIndex) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }

        }

        return pivot;

    }

    public static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        // pivot index nikal na parega
        int pivotIndex = partition(arr, si, ei);
        // partion kam hai
        quickSort(arr, si, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, ei);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 5, 2};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
