public class nineteen {
    public static void main(String[] args) {
        int lowerlimit = 4;
        int upperlimit = 100;
        displayPrime(lowerlimit,upperlimit);
    }
    static boolean isPrime(int num) {
        if (num<=1) {
            return false;
        }
        for (int i =2; i <= Math.sqrt(num); i++) {
            if (num % i ==0) {
                return false;
            }
        }
        return true;
    }
    static void displayPrime(int n , int m){
        for (int i =n; i<=m; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }
}