public class fifteen {
    public static void main(String[] args) {
        // linear search program
        int [] nums = {23, 34, 42, 53, 25, 3};
        int target = 25;
        int ans = linearSearch(nums , target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
            for ( int index = 0; index < arr.length; index++) {
                int element = arr[index];
                if(element == target) {
                    return index;
                }
            }
            return -1;
    }}

