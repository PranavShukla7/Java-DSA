public class twenty {
    public static void main(String[] args) {
       Palindrome(313);
    }

    static void Pythagoras(int a, int b, int c) {
        int d = (b*b)+(a*a);
        int f = (c*c);
        if(f == d) {
            System.out.println("It is Pythagorean triplet");
        } else {
            System.out.println("It is not a pythagorean triplet");
        }
    }
    static void Palindrome(int n) {
        int temp = n;
        int sum =0;
        while (n > 0) {
           int r = n % 10; // Get the remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome");
    }
}

