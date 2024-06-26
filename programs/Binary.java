import static java.util.Arrays.binarySearch;

public class Binary {
    public static void main(String[] args) {
        int [] arr = {-12, -11, 1, 4 , 5 , 7 ,8 , 13, 15};
        int target = 5;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while (start<=end) {
            int mid  = start + (end-start)/2;

            if (target < arr[mid]) {
                end = mid -1;
            }
            else if (target > arr[mid]) {
                start = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
