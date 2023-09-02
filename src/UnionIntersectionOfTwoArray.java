/**
 * Given two sorted arrays, find their union and intersection.
 * Example:
 *
 * Input: arr1[] = {1, 3, 4, 5, 7}
 *         arr2[] = {2, 3, 5, 6}
 *
 * To find union of two sorted arrays, follow the following merge procedure :
 * 1) Use two index variables i and j, initial values i = 0, j = 0
 * 2) If arr1[i] is smaller than arr2[j] then print arr1[i] and increment i.
 * 3) If arr1[i] is greater than arr2[j] then print arr2[j] and increment j.
 * 4) If both are same then print any of them and increment both i and j.
 * 5) Print remaining elements of the larger array.
 */
public class UnionIntersectionOfTwoArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };
        int m = arr1.length;
        int n = arr2.length;
        printUnion(arr1, arr2, m, n);
    }

    /* Function prints union of arr1[] and arr2[]
    m is the number of elements in arr1[]
    n is the number of elements in arr2[] */
    public static void printUnion(int arr1[], int arr2[], int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++]+" ");
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++]+" ");
            else {
                System.out.print(arr1[i++]+" ");
                j++;
            }
        }

        /* Print remaining elements of the larger array */
        while (i < m)
            System.out.print(arr1[i++]+" ");
        while (j < n)
            System.out.print(arr2[j++]+" ");
    }
}
