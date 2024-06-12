import java.util.Scanner;
public class eleven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //three digit armstrong numbers
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }
    static boolean isArmstrong(int n) {
        int Original = n;
        int sum =0;
        while (n > 0) {
            int rem = n % 10;
            n = n/ 10;
            sum = sum + rem*rem*rem;
        }
        return sum == Original;

    }
}
