import java.util.Arrays;

/**
 *Given an array, write functions to find the minimum and maximum elements in it.
 *
 */

public class MinMaxElement {
    public static void main(String[] args) {
        int arr[] = {12, 1234, 45, 67, 1};
        inBuiltFun(arr);
        System.out.println("---------------------");
        arrayStream(arr);
        System.out.println("---------------------");
        userDefinedFun(arr);
    }

    static void inBuiltFun(int arr[]) {
        Arrays.sort(arr);
        System.out.println("Min Element : "+arr[0]);
        System.out.println("Max Element : "+arr[arr.length-1]);
    }

    static void arrayStream(int arr[]) {
        System.out.println("Min Element : "+Arrays.stream(arr).min().getAsInt());
        System.out.println("Max Element : "+Arrays.stream(arr).max().getAsInt());
    }

    static void userDefinedFun(int arr[]) {
        int length = arr.length;

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println("Min Element : "+min);
        System.out.println("Max Element : "+max);
    }
}
