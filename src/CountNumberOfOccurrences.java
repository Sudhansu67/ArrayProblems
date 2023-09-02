/**
 * Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]. Expected time complexity is O(Logn)
 *
 * Examples:
 *   Input: arr[] = {1, 1, 2, 2, 2, 2, 3}   x = 2
 *   Output: 4 // x (or 2) occurs 4 times in arr[]
 *
 *   Input: arr[] = {1, 1, 2, 2, 2, 2, 3}   x = 3
 *   Output: 1
 */

public class CountNumberOfOccurrences {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
        int size = arr.length;
        int x = 2;
        System.out.println(countOccurrences(arr, size, x));
    }

    public static int countOccurrences(int arr[], int size, int x) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (x == arr[i])
                count++;
        }
        return count;
    }
}
