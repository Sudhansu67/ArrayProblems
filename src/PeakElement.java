/**
 * Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors.
 * Note: For corner elements, we need to consider only one neighbor.
 *
 * Input: array[]= {5, 10, 20, 15}
 * Output: 20
 * Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
 *
 */

public class PeakElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 15, 2, 23, 90, 67};
        System.out.println(findPeak(arr));
    }

    static int findPeak(int arr[]) {
        int length = arr.length;

        if (arr.length == 1)
            return 0;
        if (arr[0] >= arr[1])
            return 0;
        if (arr[length-1] >= arr[length-2])
            return length-1;

        for (int i = 1; i < length - 1; i++) {
            if (arr[i] >= arr[i-1] && arr[i] >= arr[i+1])
                return i;
        }
        return 0;
    }
}