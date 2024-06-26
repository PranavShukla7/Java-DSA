import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        //insertion sort algorithm
        int[] arr = {4, 5, 3, 1, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            for (int j =i+1; j>0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr,j,j-1);
                } else {
                    break;
                }

            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
