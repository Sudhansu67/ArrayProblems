import java.util.Arrays;

/**
 * Given an array and a number K where K is smaller than the size of the array.
 * Find the K’th smallest element in the given array. Given that all array elements are distinct.
 *
 * Examples:
 * Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3
 * Output: 7
 *
 * Follow the given steps to solve the problem:
 * Sort the input array in the increasing order
 * Return the element at the K-1 index (0 – Based indexing) in the sorted array
 */

public class KthSmallest {
    public static void main(String[] args) {
        int arr[] = { 12, 3, 5, 7, 19 };
        int K = 2;

        System.out.print("K'th smallest element is "
                + kthSmallestElement(arr, K));
    }

    static int kthSmallestElement(int arr[], int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }
}
