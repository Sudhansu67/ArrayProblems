/**
 * sort an array in ascending order
 *
 */

public class SortArray {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        //bubbleSort(arr);
        //selectionSort(arr);
        insertionSort(arr);
        printArray(arr, arr.length);

    }

    //logic : push big element at the end of the array
    //time complexity = O(n^2)
    static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //logic : find the smallest element in every iteration and swap with current iteration index
    //time complexity = O(n^2)
    static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    //logic : the array will be separated into two parts. left part will be sorted and right part will be unsorted
    static void insertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }

    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
