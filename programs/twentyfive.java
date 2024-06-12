import java.util.Arrays;

import static java.util.Collections.swap;

public class twentyfive {
    public static void main(String[] args) {
        //selection sort algorithm
        int[] arr = {3, 1, 5, 4, 2};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void bubblesort(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            int last = arr.length-1-i;
            int maxIndex = getMaxindex(arr,0,last);
            swap(arr, maxIndex, last);
        }
    }

     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxindex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i<=end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
