/**
 * Given an array (or string), the task is to reverse the array/string.
 *
 * Example:
 * Input  : arr[] = {1, 2, 3}
 * Output : arr[] = {3, 2, 1}
 * */

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        reverseArray(arr, 0, arr.length-1);
        printArray(arr, arr.length);
    }
    static void reverseArray(int arr[], int start, int end) {
        int temp;
        while(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
