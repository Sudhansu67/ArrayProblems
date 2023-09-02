import java.util.ArrayList;

/**
 * Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.
 *
 * Note: There may be more than one subarray with sum as the given sum, print first such subarray.
 *
 * Examples:
 *
 * Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
 * Output: Sum found between indexes 2 and 4
 * Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33
 */

public class FindSubArrayForSum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};
        ArrayList<Integer> indexList = subArraySum(arr, arr.length, 33);
        for (Integer index : indexList)
            System.out.println(index);
    }

    public static ArrayList<Integer> subArraySum(int arr[], int n, int s) {
        int l = 0;
        int r = 0;
        int sum = arr[0];
        ArrayList<Integer> indexList = new ArrayList<>();
        boolean isFound = false;
        while (r < n) {
            if (sum == s) {
                isFound = true;
                break;
            } else if (sum < s) {
                r++;
                if (r < n) {
                   sum += arr[r];
                }
            } else {
                sum -= arr[l];
                l++;
            }
        }

        if (isFound) {
            indexList.add(l);
            indexList.add(r);
        } else {
            indexList.add(-1);
        }
        return indexList;
    }
}
