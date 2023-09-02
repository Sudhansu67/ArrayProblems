public class Sort0s1s2s {
    public static void main(String[] args) {
        int arr[] = {2, 0, 2, 2, 0, 1, 1};
        threeNumberSort(arr);
        printArray(arr, arr.length);
    }

    public static void threeNumberSort(int arr[]) {
        int i = 0;
        int j = 0;
        int k = arr.length - 1;
        while (i <= k) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else if (arr[i] == 2) {
                swap(arr, i, k);
                k--;
            }
        }
    }
    public static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
