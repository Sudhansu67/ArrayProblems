/**
 * An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.
 * Examples :
 * Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
 * Output: -12 -13 -5 -7 -3 -6 11 6 5
 */

public class MoveNegativeNumberLeft {
    public static void main(String[] args) {
        int[] arr = { 1, 2,  -4, -5, 2, -7, 3, 2, -6, -8, -9, 3, 2,  1 };
        move(arr);
        printArray(arr, arr.length);
    }

    public static void move(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            if (arr[low] <= 0)
                low++;
            else
                swap(arr, low, high--);
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
