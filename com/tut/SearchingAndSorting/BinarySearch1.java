package com.tut.SearchingAndSorting;

public class BinarySearch1 {
    public static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 4,7,12,16,20,24,27,30,36,40};
        int n = arr.length;
        int x = 20;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println(
                    "Element is present at index " + (result+1));

    }
}
