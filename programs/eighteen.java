public class eighteen {
    public static void main(String[] args) {
        //Minimum number in array
        int[] arr = {32, 23, 52, 67,3, 64};
        System.out.println(min(arr));
    }

    static int min(int[]arr) {
        int ans = arr[0];
        for(int i =1; i< arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

}
